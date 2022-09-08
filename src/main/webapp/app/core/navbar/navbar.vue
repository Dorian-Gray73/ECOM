<template>
  <b-navbar id="navbar">
    <b-navbar-brand href="#">
      <svg width="279" height="96" viewBox="0 0 279 121" fill="none" xmlns="http://www.w3.org/2000/svg">
        <path d="M68 84.1042V32H76.4256V76.6394H97.6015V84.1042H68Z" fill="#243D53" />
        <path
          d="M128.536 77.6845H128.238C127.89 78.63 127.418 79.5507 126.821 80.4465C126.275 81.3423 125.554 82.1385 124.659 82.8352C123.814 83.4822 122.77 84.0047 121.528 84.4028C120.335 84.8009 118.943 85 117.352 85C113.326 85 110.194 83.7061 107.957 81.1183C105.77 78.5305 104.676 74.823 104.676 69.9958V45.2873H112.804V68.9507C112.804 74.9723 115.289 77.9831 120.26 77.9831C121.304 77.9831 122.323 77.8587 123.317 77.6099C124.311 77.3113 125.181 76.8883 125.927 76.3408C126.722 75.7934 127.343 75.0967 127.791 74.2507C128.288 73.4047 128.536 72.4094 128.536 71.2648V45.2873H136.664V84.1042H128.536V77.6845Z"
          fill="#243D53"
        />
        <path
          d="M180.537 55.2901L174.796 44.2423H174.572V84.1042H166.519V32H175.914L192.915 60.8141L198.656 71.862H198.88V32H206.932V84.1042H197.538L180.537 55.2901Z"
          fill="#243D53"
        />
        <path
          d="M234.362 85C231.578 85 229.093 84.5272 226.905 83.5817C224.718 82.6361 222.854 81.2925 221.313 79.5507C219.772 77.7592 218.579 75.6192 217.734 73.131C216.939 70.593 216.541 67.7812 216.541 64.6958C216.541 61.6103 216.939 58.8235 217.734 56.3352C218.579 53.7972 219.772 51.6573 221.313 49.9155C222.854 48.1239 224.718 46.7554 226.905 45.8099C229.093 44.8643 231.578 44.3915 234.362 44.3915C237.195 44.3915 239.681 44.8892 241.818 45.8845C244.005 46.8798 245.82 48.2732 247.261 50.0648C248.703 51.8066 249.771 53.8469 250.467 56.1859C251.213 58.5249 251.586 61.038 251.586 63.7254V66.7859H224.967V68.0549C224.967 71.0408 225.837 73.5042 227.577 75.4451C229.366 77.3361 231.901 78.2817 235.182 78.2817C237.568 78.2817 239.581 77.7592 241.222 76.7141C242.862 75.669 244.254 74.2507 245.397 72.4592L250.169 77.162C248.728 79.5507 246.64 81.4667 243.906 82.9099C241.172 84.3033 237.991 85 234.362 85ZM234.362 50.7366C232.97 50.7366 231.678 50.9854 230.485 51.4831C229.341 51.9807 228.347 52.6775 227.502 53.5732C226.707 54.469 226.085 55.539 225.638 56.7831C225.191 58.0272 224.967 59.3958 224.967 60.8887V61.4113H243.011V60.6648C243.011 57.6789 242.241 55.2901 240.7 53.4986C239.159 51.6573 237.046 50.7366 234.362 50.7366Z"
          fill="#243D53"
        />
        <path
          d="M271.32 84.1042C268.487 84.1042 266.349 83.3826 264.908 81.9394C263.466 80.4465 262.745 78.3563 262.745 75.669V51.931H256.706V45.2873H259.986C261.329 45.2873 262.248 44.9887 262.745 44.3915C263.292 43.7944 263.565 42.8239 263.565 41.4803V34.6873H270.873V45.2873H279V51.931H270.873V77.4606H278.403V84.1042H271.32Z"
          fill="#243D53"
        />
        <g filter="url(#filter0_b_1_148)">
          <circle cx="60.5" cy="60.5" r="60.5" fill="#5B85AA" fill-opacity="0.18" />
        </g>
        <defs>
          <filter
            id="filter0_b_1_148"
            x="-2"
            y="-2"
            width="125"
            height="125"
            filterUnits="userSpaceOnUse"
            color-interpolation-filters="sRGB"
          >
            <feFlood flood-opacity="0" result="BackgroundImageFix" />
            <feGaussianBlur in="BackgroundImage" stdDeviation="1" />
            <feComposite in2="SourceAlpha" operator="in" result="effect1_backgroundBlur_1_148" />
            <feBlend mode="normal" in="SourceGraphic" in2="effect1_backgroundBlur_1_148" result="shape" />
          </filter>
        </defs>
      </svg>
    </b-navbar-brand>
    <div class="navbar-nav ml-auto">
      <b-nav-item href="#" class="navbar-nav">
        <font-awesome-icon icon="fa-solid fa-solid fa-house" />
        Accueil
      </b-nav-item>
      <b-nav-item href="#" class="navbar-nav" v-on:click="openLogin()">
        <font-awesome-icon icon="fa-solid fa-user" />
        Connexion
      </b-nav-item>
      <b-nav-item href="#" class="navbar-nav">
        <font-awesome-icon icon="fa-solid fa-magnifying-glass" />
        Recherche
      </b-nav-item>
      <b-nav-item href="#" class="navbar-nav">
        <font-awesome-icon :icon="['fa', 'fa-cart-shopping']" class="icon alt" />
        Panier
      </b-nav-item>
    </div>
  </b-navbar>
</template>
<script lang="ts" src="./navbar.component.ts"></script>
<style scoped>
#navbar {
  background-color: #ffffff;
  margin-top: 32px;
  margin-bottom: 26px;
  margin-left: 4%;
  margin-right: 4%;
  box-shadow: 0px 4px 16px rgba(94, 102, 161, 0.05);
  height: 96px;
}

.navbar-light .navbar-nav .nav-link {
  color: #000000;
}

li {
  list-style-type: none;
}

a {
}
</style>
