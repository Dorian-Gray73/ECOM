import { Component, Vue } from 'vue-property-decorator';

@Component
export default class JhiFooter extends Vue {
  //Button return to navbar
  scrollMeTo(refName) {
    var element = this.$refs[refName];
    if (element instanceof HTMLElement) {
      var top = element.offsetTop;
    }
    window.scrollTo(0, top);
  }
}
