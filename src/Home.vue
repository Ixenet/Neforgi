<script setup>
import { ref } from 'vue'
import GetClothes from "./assets/scripts/dataBaseEmulator";
const data = GetClothes();

const name = ref('');
const email = ref('');
const comment = ref('');

const sent = ref(false);
const sentData = ref({
  name: '',
  email: '',
  comment: ''
});

function validateEmail(value) {
  const re = /^(([^<>()[\]\\.,;:\s@"]+(\.[^<>()[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/
  return re.test(value)
}

function handleSubmit() {
  if (!name.value.trim() || !comment.value.trim()) {
    alert("Поля «Имя» и «Комментарий» не могут быть пустыми.")
    return
  }
  if (email.value && !validateEmail(email.value)) {
    alert("Email введён некорректно.")
    return
  }

  sentData.value = {
    name: name.value,
    email: email.value,
    comment: comment.value
  }
  sent.value = true
  alert("Успешно отправлено!")

  name.value = ''
  email.value = ''
  comment.value = ''
}
</script>

<template>
  <nav class="navbar navbar-expand-lg navbar-light bg-light">
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
          v-for="{ id, name: itemName, price, pictureUrl } in data"
          :key="id"
          class="col mb-5"
        >
          <div class="card h-100">
            <RouterLink :to="`/catalog/sweatshirts/${id}`">
              <img :src="pictureUrl" class="card-img-top itemImg" alt="supply" />
              <div class="card-body p-4">
                <div class="text-center">
                  <h5 class="fw-bolder">{{ itemName }}</h5>
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
  </footer>
</template>

<script>
export default {
  name: 'Home'
}
</script>
