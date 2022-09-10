import { ICaracteristique } from '@/shared/model/caracteristique.model';
import { ITransaction } from '@/shared/model/transaction.model';

export interface ILigneTransaction {
  id?: number;
  quantite?: number | null;
  prixUnitaire?: number | null;
  caracteristique?: ICaracteristique | null;
  transaction?: ITransaction | null;
}

export class LigneTransaction implements ILigneTransaction {
  constructor(
    public id?: number,
    public quantite?: number | null,
    public prixUnitaire?: number | null,
    public caracteristique?: ICaracteristique | null,
    public transaction?: ITransaction | null
  ) {}
}
