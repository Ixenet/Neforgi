<script setup>
import { ref, onMounted } from 'vue'
import { useRoute } from 'vue-router'
import axios from 'axios'

const route = useRoute()
const product = ref(null)
const error = ref(null)

onMounted(async () => {
  const id = route.params.id
  try {
    const resp = await axios.get(`/api/products/${id}`)
    product.value = resp.data
  } catch (e) {
    error.value = e
    console.error('Не удалось загрузить продукт', e)
  }
})
</script>

<template>
  <div v-if="error">
    Ошибка: {{ error.message }}
  </div>
  <div v-else-if="product">
    <section class="py-5">
      <div class="container px-4 px-lg-5 my-5">
        <div class="row gx-4 gx-lg-5 align-items-center">
          <div class="col-md-6">
            <img
              class="card-img-top mb-5 mb-md-0"
              :src="product.imageUrl"
              :alt="product.name"
            />
          </div>
          <div class="col-md-6">
            <h2 class="display-5 fw-bolder">{{ product.name }}</h2>
            <div class="fs-5 mb-5">
              <span class="text-decoration-line-through">
                ${{ (product.price * 1.1).toFixed(2) }}
              </span>
              <span>${{ product.price }}</span>
            </div>
            <p class="lead">{{ product.description }}</p>
            <div class="d-flex">
              <input
                class="form-control text-center me-3"
                id="inputQuantity"
                type="number"
                value="1"
                style="max-width: 3rem"
              />
              <button class="btn btn-outline-dark flex-shrink-0" type="button">
                <i class="bi-cart-fill me-1"></i>
                Add to cart
              </button>
            </div>
          </div>
        </div>
      </div>
    </section>
  </div>
  <div v-else>
    Загрузка...
  </div>
</template>
