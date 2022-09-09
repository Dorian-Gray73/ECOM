<template>
  <div id="pageRecherche">
    <span id="title">Résultats de la recherche</span>
    <hr id="separate" />
    <b-input-group id="searchBar">
      <font-awesome-icon icon="fa-solid fa-magnifying-glass" id="iconSearchBar" />
      <b-form-input placeholder="Nom d'une monture" id="inputSearchBar"></b-form-input>
    </b-input-group>

    <div id="containerSearch">
      <b-container id="affichageSearch">
        <b-row>
          <b-col>
            <div class="cardPhoto">
              <div id="photo"></div>
              <div id="nomMonture">Lunette</div>
              <div id="prixMonture">130 euros</div>
            </div>
          </b-col>
          <b-col>
            <div class="cardPhoto">
              <div id="photo"></div>
              <div id="nomMonture">Lunette</div>
              <div id="prixMonture">130 euros</div>
            </div>
          </b-col>
          <b-col>
            <div class="cardPhoto">
              <div id="photo"></div>
              <div id="nomMonture">Lunette</div>
              <div id="prixMonture">130 euros</div>
            </div>
          </b-col>
        </b-row>
      </b-container>
      <div id="filtres">
        <div>Couleur</div>
        <b-form-group label="Form-checkbox-group stacked checkboxes" v-slot="{ ariaDescribedby }">
          <b-form-checkbox-group
            v-model="selected"
            :options="options"
            :aria-describedby="ariaDescribedby"
            name="flavour-2a"
            stacked
          ></b-form-checkbox-group>
        </b-form-group>
        <div>Prix</div>
      </div>
    </div>
  </div>
</template>
<style scoped>
#searchBar {
  width: 85vw;
  margin: 0 auto;
  background-color: #ffffff;
  display: flex;
  gap: 16px;
  padding: 8px 16px;
}

#inputSearchBar {
  margin: auto;
  border: none;
  flex: 1;
}

#iconSearchBar {
  width: 16px;
  margin: auto;
}

#containerSearch {
  display: flex;
  flex-direction: row;
  justify-content: center;
  align-items: flex-start;
  padding: 0px;
  gap: 32px;
  margin: 20px auto;

  width: 1201px;
  height: 1186px;
}

#affichageSearch {
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: flex-start;
  padding: 0px;
  gap: 32px;

  width: 964px;
  height: 1186px;
}

#filtres {
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: flex-start;
  padding: 32px;
  gap: 64px;

  width: 205px;
  height: 656px;

  background: #ffffff;
}

.cardPhoto {
  display: flex;
  flex-direction: column;
  align-items: flex-start;
  padding: 24px;
  gap: 16px;

  width: 304px;
  height: 374px;

  background: #ffffff;
}

#photo {
  width: 256px;
  height: 256px;
  background-color: #f7f7f7;
}

#nomMonture {
  font-family: 'IBM Plex Sans';
  font-style: normal;
  font-weight: 700;
  font-size: 18px;
  line-height: 23px;

  color: #5b85aa;
}

#prixMonture {
  font-family: 'IBM Plex Sans';
  font-style: normal;
  font-weight: 400;
  font-size: 18px;
  line-height: 23px;

  color: #5b85aa;
}
</style>
