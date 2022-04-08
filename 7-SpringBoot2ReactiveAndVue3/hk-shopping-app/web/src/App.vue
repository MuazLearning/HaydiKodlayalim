<template>
  <div id="app">
    <ProductVue/>
  </div>
</template>

<script>
import ProductVue from './components/Product.vue'

export default {
  name: 'App',
  components: {
    ProductVue
  }
}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  background-color: #f6f6f6;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
