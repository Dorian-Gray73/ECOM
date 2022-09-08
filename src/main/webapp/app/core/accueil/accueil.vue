<template>
  <div id="accueil">
    <span id="title">À la une</span>
    <hr id="separate" />
    <b-carousel id="carousel-fade" style="text-shadow: 0px 0px 2px #000" fade indicators img-width="1024" img-height="480">
      <b-carousel-slide caption="First Slide" img-src="https://picsum.photos/1024/480/?image=10"></b-carousel-slide>
      <b-carousel-slide caption="Second Slide" img-src="https://picsum.photos/1024/480/?image=12"></b-carousel-slide>
      <b-carousel-slide caption="Third Slide" img-src="https://picsum.photos/1024/480/?image=22"></b-carousel-slide>
    </b-carousel>
  </div>
</template>

<script lang="ts" src="./accueil.component.ts"></script>

<style scoped>
#separate {
  background-color: #5b85aa;
  border: 2px solid #5b85aa;
  height: 0px;
}

id {
}
#title {
  font-family: 'IBM Plex Sans';
  font-style: normal;
  font-weight: 600;
  font-size: 24px;
  line-height: 31px;
  margin-left: 4%;
}
</style>
