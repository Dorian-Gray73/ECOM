<template>
  <b-navbar id="navbar">
    <b-navbar-brand href="#"> NavBar</b-navbar-brand>
    <b-nav-item href="#" right><font-awesome-icon icon="fa-solid fa-solid fa-house" /> Accueil</b-nav-item>
    <b-nav-item href="# right"><font-awesome-icon icon="fa-solid fa-user" /> Connexion</b-nav-item>
    <b-nav-item href="#" right><font-awesome-icon icon="fa-solid fa-magnifying-glass" /> Recherche</b-nav-item>
    <b-nav-item href="#" right> Panier <font-awesome-icon :icon="['fa', 'fa-cart-shopping']" class="icon alt" /></b-nav-item>
  </b-navbar>
</template>
<script lang="ts" src="./navbar.component.ts"></script>
<style scoped>
#navbar {
  background-color: #ffffff;
  margin-top: 32px;
  margin-left: 4%;
  margin-right: 4%;
  box-shadow: 0px 4px 16px rgba(94, 102, 161, 0.05);
}

li {
  list-style-type: none;
}
</style>
