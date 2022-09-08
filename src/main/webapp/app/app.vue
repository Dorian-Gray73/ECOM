<template>
  <div id="app">
    <!-- <ribbon></ribbon>-->
    <div id="app-header">
      <!-- <jhi-navbar></jhi-navbar>-->
      <navbar></navbar>
    </div>
    <div class="container-fluid" id="containerfluid">
      <div class="card jh-card">
        <router-view></router-view>
      </div>
      <!-- <b-modal id="login-page" hide-footer lazy>
        <span data-cy="loginTitle" slot="modal-title" id="login-title" v-text="$t('login.title')">Sign in</span>
        <login-form></login-form>
      </b-modal>-->

      <jhi-footer></jhi-footer>
    </div>
  </div>
</template>

<script lang="ts" src="./app.component.ts"></script>

<style>
html {
  background-color: #f7f7f7;
}

#app {
  font-family: 'IBM Plex Sans';
  font-style: normal;
  color: #5b85aa;
  background-color: #f7f7f7;
}
#containerfluid {
  padding-left: 0;
  padding-right: 0;
}

a {
  text-decoration: none;
}
</style>
