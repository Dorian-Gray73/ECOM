import { IPost } from '@/shared/model/post.model';

export interface ITag {
  id?: number;
  name?: string;
  blogs?: IPost[] | null;
}

export class Tag implements ITag {
  constructor(public id?: number, public name?: string, public blogs?: IPost[] | null) {}
}
