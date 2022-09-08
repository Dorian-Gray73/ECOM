<template>
  <div id="app">
    <!-- <ribbon></ribbon>-->
    <div id="app-header">
      <!-- <jhi-navbar></jhi-navbar>-->
      <navbar></navbar>
    </div>
    <div class="container-fluid" id="containerfluid">
      <router-view></router-view>
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
  font-family: 'IBM Plex Sans';
}

#title {
  font-style: normal;
  font-weight: 600;
  font-size: 24px;
  line-height: 31px;
  margin-left: 4%;
}

#separate {
  background-color: #5b85aa;
  border: 2px solid #5b85aa;
  height: 0px;
  margin-top: 4px;
}

#app {
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
