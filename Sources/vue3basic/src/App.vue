<template>
  <div>
    <p>book.author: {{ book.author }}</p>
    <p>book.title: {{ book.title }}</p>
    <p>author: {{ author }}</p>
    <p>title: {{ title }}</p>
  </div>
</template>

<script>
import { reactive } from 'vue'

export default {
  setup() {
    const book = reactive({
      author: 'Vue3',
      year: '2024',
      title: 'Vue3 기본',
      description: '당신은 이 책을 읽습니다  ;)',
      price: '22000'
    })

    return {
      book
    }
  }
}
</script>

<style lang="scss" scoped></style>
