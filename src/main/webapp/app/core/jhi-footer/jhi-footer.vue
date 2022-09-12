<template>
  <div id="footer">
    <a @click="scrollMeTo('navbar')"><span id="title">Retourner en haut</span></a>
    <hr id="separate" />
    <b-container>
      <!-- Ligne 1 -->
      <b-row id="firstRow">
        <b-col>
          <div>Lu Net</div>
        </b-col>
        <b-col>
          <div>Shopping</div>
        </b-col>
        <b-col>Corporate</b-col>
      </b-row>
      <!-- Ligne 2 -->
      <b-row>
        <b-col>
          <div>8 Boulevard Sérurier</div>
        </b-col>
        <b-col> Solaires </b-col>
        <b-col> À propos </b-col>
      </b-row>
      <!-- Ligne 3 -->
      <b-row>
        <b-col>
          <div>75019 Paris</div>
        </b-col>
        <b-col> Vue </b-col>
        <b-col> Carrières</b-col>
      </b-row>
      <!-- Ligne 4 -->
      <b-row>
        <b-col>
          <div>01 02 03 04 05</div>
        </b-col>
        <b-col> Toutes les lunettes </b-col>
        <b-col></b-col>
      </b-row>
      <b-row>
        <b-col>
          <div>hello@lunet.com</div>
        </b-col>
        <b-col> Accessoires</b-col>
        <b-col></b-col>
      </b-row>
    </b-container>
  </div>
</template>

<script lang="ts" src="./jhi-footer.component.ts"></script>

<style scoped>
#footer {
  height: 344px;
}

#firstRow {
  margin-top: 64px;
  font-weight: bold;
}
</style>
