<script setup>
  import GetClothes from "./assets/scripts/dataBaseEmulator";
  const data = GetClothes();
</script>
<template>

  <nav class="navbar navbar-expand-lg navbar-light bg-light">
    <RouterLink to="/" class="navbar-brand">
      <img src="./assets/images/neforgi-removebg-preview.png" class="bi me-2" aria-hidden="true" id="logo1" />
    </RouterLink>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
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
  <img src="./assets/images/bg (Пользовательское).png" class="img-fluid" alt="Neforgi main"/>
  <section class="py-5">
    <div class="container px-4 px-lg-5 mt-5">
      <div class="row gx-4 gx-lg-5 row-cols-2 row-cols-md-3 row-cols-xl-4 justify-content-center">
          <div v-for="{id, name, price, pictureUrl} in data" :key="id" class="col mb-5">
              <div class="card h-100">
                <RouterLink to="/catalog/sweatshirts/2">
                  <img :src="pictureUrl" class="card-img-top itemImg" alt="supply"/>
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
  <footer class="py-5 bg-dark">
    <div class="container">
      <img src="./assets/images/neforgi-removebg-preview.png" class="logo" id="logo2"/>
    </div>
  </footer>
</template>
<script>
export default {
    name: 'Home'
}
</script>
