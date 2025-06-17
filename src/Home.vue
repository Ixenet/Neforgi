<script setup>
import { ref, onMounted} from 'vue';
import axios from 'axios';

const data = ref([]);
const error = ref(null);


onMounted(async () => {
  try {
    const resp = await axios.get('/api/products')
    data.value = resp.data
  } catch (e) {
    error.value = e
    console.error('Не удалось загрузить продукты', e)
  }
})
</script>

<template>
    <div v-if="error">
    Ошибка загрузки: {{ error.message }}
  </div>
  <div v-else><nav class="navbar navbar-expand-lg navbar-light bg-light">
    <RouterLink to="/" class="navbar-brand">
      <img src="./assets/images/neforgi-removebg-preview.png" class="bi me-2" aria-hidden="true" id="logo1" />
    </RouterLink>
    <button
      class="navbar-toggler"
      type="button"
      data-toggle="collapse"
      data-target="#navbarNavDropdown"
      aria-controls="navbarNavDropdown"
      aria-expanded="false"
      aria-label="Toggle navigation"
    >
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarNavDropdown">
      <ul class="navbar-nav">
        <li class="nav-item">
          <RouterLink to="#" class="nav-link">ХУДИ</RouterLink>
        </li>
        <li class="nav-item">
          <RouterLink to="#" class="nav-link">АКСЕССУАРЫ</RouterLink>
        </li>
        <li class="nav-item">
          <RouterLink to="#" class="nav-link">КРОССОВКИ</RouterLink>
        </li>
        <li class="nav-item">
          <RouterLink to="#" class="nav-link">ШТАНЫ</RouterLink>
        </li>
      </ul>
    </div>
  </nav>

  <img
    src="./assets/images/bg (Пользовательское).png"
    class="img-fluid"
    alt="Neforgi main"
  />

  <section class="py-5">
    <div class="container px-4 px-lg-5 mt-5">
      <div class="row gx-4 gx-lg-5 row-cols-2 row-cols-md-3 row-cols-xl-4 justify-content-center">
         <div
      v-for="{ id, name, price, imageUrl } in data"
      :key="id"
      class="col mb-5"
    >
      <div class="card h-100">
        <RouterLink :to="`/catalog/sweatshirts/${id}`">
          <img :src="imageUrl" class="card-img-top itemImg" alt="item" />
          <div class="card-body p-4">
            <div class="text-center">
              <h5 class="fw-bolder">{{ name }}</h5>
              <p class="price">${{ price }}</p>
            </div>
          </div>
        </RouterLink>
      </div>
    </div>
      </div>
    </div>
  </section>


  <section class="py-5 bg-light">
    <div class="container px-4 px-lg-5">
      <h3 class="mb-4">Обратная связь</h3>
      <form @submit.prevent="handleSubmit" novalidate>
        <div class="mb-3">
          <label for="fb-name" class="form-label">Имя</label>
          <input
            id="fb-name"
            type="text"
            class="form-control"
            v-model="name"
            placeholder="Ваше имя"
            required
          />
        </div>
        <div class="mb-3">
          <label for="fb-email" class="form-label">Email</label>
          <input
            id="fb-email"
            type="email"
            class="form-control"
            v-model="email"
            placeholder="example@domain.com"
          />
        </div>
        <div class="mb-3">
          <label for="fb-comment" class="form-label">Комментарий</label>
          <textarea
            id="fb-comment"
            class="form-control"
            v-model="comment"
            rows="4"
            placeholder="Ваш отзыв"
            required
          ></textarea>
        </div>
        <button type="submit" class="btn btn-primary">Отправить</button>
      </form>

      <div v-if="sent" class="mt-4 p-3 border rounded bg-white">
        <h5>Вы отправили:</h5>
        <p><strong>Имя:</strong> {{ sentData.name }}</p>
        <p><strong>Email:</strong> {{ sentData.email }}</p>
        <p><strong>Комментарий:</strong> {{ sentData.comment }}</p>
      </div>
    </div>
  </section>

  <footer class="py-5 bg-dark">
    <div class="container">
      <img src="./assets/images/neforgi-removebg-preview.png" class="logo" id="logo2" />
    </div>
  </footer></div>
</template>

<script>
export default {
  name: 'Home'
}
</script>
