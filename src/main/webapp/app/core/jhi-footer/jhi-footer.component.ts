import { Component, Vue } from 'vue-property-decorator';

@Component
export default class JhiFooter extends Vue {
  //Button return to navbar
  scrollMeTo(refName) {
    let element = this.$refs[refName];
    let top;
    if (element instanceof HTMLElement) {
      top = element.offsetTop;
    }
    window.scrollTo(0, top);
  }
}
