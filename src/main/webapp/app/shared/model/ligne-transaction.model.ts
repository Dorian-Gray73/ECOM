import { ICaracteristique } from '@/shared/model/caracteristique.model';
import { ITransaction } from '@/shared/model/transaction.model';

export interface ILigneTransaction {
  id?: number;
  transactionID?: number | null;
  caracteristiqueID?: number | null;
  quantite?: number | null;
  prixUnitaire?: number | null;
  caracteristiqueID?: ICaracteristique | null;
  transaction?: ITransaction | null;
}

export class LigneTransaction implements ILigneTransaction {
  constructor(
    public id?: number,
    public transactionID?: number | null,
    public caracteristiqueID?: number | null,
    public quantite?: number | null,
    public prixUnitaire?: number | null,
    public caracteristiqueID?: ICaracteristique | null,
    public transaction?: ITransaction | null
  ) {}
}
