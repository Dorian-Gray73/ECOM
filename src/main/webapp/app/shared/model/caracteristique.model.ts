import { ILigneTransaction } from '@/shared/model/ligne-transaction.model';
import { IImage } from '@/shared/model/image.model';
import { IProduit } from '@/shared/model/produit.model';

export interface ICaracteristique {
  id?: number;
  caracteristiqueID?: number | null;
  produitID?: number | null;
  couleur?: string | null;
  quantite?: number | null;
  ligneTransaction?: ILigneTransaction | null;
  images?: IImage[] | null;
  produit?: IProduit | null;
}

export class Caracteristique implements ICaracteristique {
  constructor(
    public id?: number,
    public caracteristiqueID?: number | null,
    public produitID?: number | null,
    public couleur?: string | null,
    public quantite?: number | null,
    public ligneTransaction?: ILigneTransaction | null,
    public images?: IImage[] | null,
    public produit?: IProduit | null
  ) {}
}
