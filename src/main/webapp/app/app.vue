<template>
  <v-app id="app">
    <ribbon></ribbon>
    <div id="app-header">
      <jhi-navbar></jhi-navbar>
    </div>
    <div>
      <router-view></router-view>

      <b-modal id="login-page" hide-footer lazy>
        <span data-cy="loginTitle" slot="modal-title" id="login-title" v-text="$t('login.title')">Sign in</span>
        <login-form></login-form>
      </b-modal>
      <jhi-footer></jhi-footer>
    </div>
  </v-app>
</template>

<script lang="ts" src="./app.component.ts"></script>
