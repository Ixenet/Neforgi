<template>
  <nav class="navbar navbar-expand-lg navbar-light bg-light">
    <RouterLink to="/" class="navbar-brand">
      <img src="./assets/images/neforgi-removebg-preview.png" class="bi me-2" aria-hidden="true" id="logo1" />
    </RouterLink>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
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
  <section class="py-5">
    <div class="container px-4 px-lg-5 my-5">
      <div class="row gx-4 gx-lg-5 align-items-center">
        <div class="col-md-6">
          <img class="card-img-top mb-5 mb-md-0" src="./assets/images/Sweatshirt/43131777.jpg" alt="supply"/>
        </div>
        <div class="col-md-6">
          <h2 class="display-5 fw-bolder">Свитшот Marselin</h2>
          <div class="fs-5 mb-5">
            <span class="text-decoration-line-through">$70</span>
            <span>$60</span>
          </div>
          <p class="lead">Состав: 80% хлопок, 20% лайкара. Оверсайз крой / унисекс. Отправка в течении 3-14 дней после заказа.</p>
          <div class="d-flex">
            <input class="form-control text-center me-3" id="inputQuantity" type="number" value="1" style="max-width: 3rem">
            <button class="btn btn-outline-dark flex-shrink-0" type="button">
              <i class="bi-cart-fill me-1"></i>
              Add to cart
            </button>
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