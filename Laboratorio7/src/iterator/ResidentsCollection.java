package iterator;

import classes.Resisente;

import java.util.List;

public class ResidentsCollection implements IterableCollection{
    List<Resisente> listaResidentes;

    public ResidentesCollection(List<Residente> listaResidentes) {
        this.listaResidentes= listaResidentes;

    @Override
    public Iterator createSolventeResidentesIterator(){
            return null;
        }

    public List<Residente> getListaDebtorsResidents(){

    }

    public List<Residente> getListaDebtorsResidnetes(){
            List<Residente> listaDebtors = new ArrayList<>();
            for (Residente residente; this.listaResidentes){
                if (resident.getSaldoDeudor() == 0)
                    listaDebtors.add(resident);
            }
            return listaDebtors;
        }
    }

}
