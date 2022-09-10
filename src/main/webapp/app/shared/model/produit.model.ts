import { ICaracteristique } from '@/shared/model/caracteristique.model';

export interface IProduit {
  id?: number;
  nom?: string | null;
  prix?: number | null;
  lienImage?: string | null;
  marque?: string | null;
  modele?: string | null;
  progressif?: boolean | null;
  caracteristiques?: ICaracteristique[] | null;
}

export class Produit implements IProduit {
  constructor(
    public id?: number,
    public nom?: string | null,
    public prix?: number | null,
    public lienImage?: string | null,
    public marque?: string | null,
    public modele?: string | null,
    public progressif?: boolean | null,
    public caracteristiques?: ICaracteristique[] | null
  ) {
    this.progressif = this.progressif ?? false;
  }
}
