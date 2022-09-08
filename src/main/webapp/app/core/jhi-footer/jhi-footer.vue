<template>
  <div id="footer">
    <hr id="separate" />
    <p v-text="$t('This is your footer et je suis un test de mise en prod')">This is your footer et je suis un test de mise en prod</p>
  </div>
</template>

<script lang="ts" src="./jhi-footer.component.ts"></script>

<style scoped>
#separate {
  background-color: #5b85aa;
  border: 2px solid #5b85aa;
  height: 0px;
}
</style>
