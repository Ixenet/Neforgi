<script setup>
  import GetClothes from "./assets/scripts/dataBaseEmulator";
  const data = GetClothes();
</script>
<template>
  <header>
    <img src="./assets/images/neforgi-removebg-preview.png" class="logo" id="logo1"/>
    <hr class="line"/>
    <div class="menu">
      <a class="menuLink">ХУДИ</a>
      <a class="menuLink">АКСЕССУАРЫ</a>
      <a class="menuLink">КРОССОВКИ</a>
      <a class="menuLink">ШТАНЫ</a>
    </div>
  </header>
  <div class="imageContainer">
    <img src="./assets/images/bg (Пользовательское).png" class="backgroundImage"/>
  </div>
  <div class="container">
    <hr class="textLine" id="textLine1"/>
    <p>ПОПУЛЯРНОЕ</p>
    <hr class="textLine" id="textLine1"/>
  </div>
  <div class="clothesContainer">
    <ul class="clothesList">
      <li v-for="{ id, name, price, pictureUrl } in data" :key="id">
        <RouterLink to="/catalog/sweatshirts/2">
          <img :src="pictureUrl" class="itemImg" alt="товар"/>
        <p class="itemName">{{ name }}</p>
        <p class="itemPrice">{{ price }} $.</p>
        </RouterLink>
    </li>
    </ul>
  </div>
  <footer>
    <div class="container" id="footerContainer">
      <hr class="textLine" id="textLine2"/>
      <img src="./assets/images/neforgi-removebg-preview.png" class="logo" id="logo2"/>
      <hr class="textLine" id="textLine2"/>
  </div>
  <div class="footerData" id="footerContainer">
    <div class="copyrightData">
      <p class="copyright">© Neforgi.com</p>
      <p class="copyright">ВСЕ ПРАВА НЕ ЗАЩИЩЕНЫ</p>
    </div>
    <div class="contacts">
      <img src="./assets/images/вк.png" class="social"/>
      <img src="./assets/images/тг.jpg" class="social"/>
    </div>
  </div>
  </footer>
</template>
<script>
export default {
    name: 'Home'
}
</script>
