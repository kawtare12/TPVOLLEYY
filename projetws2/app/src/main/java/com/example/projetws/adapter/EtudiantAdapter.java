package com.example.projetws.adapter;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.ArrayList;

import com.example.projetws.R;
import com.example.projetws.beans.Etudiant;

public class EtudiantAdapter extends ArrayAdapter<Etudiant> {

    private ArrayList<Etudiant> etudiantList;
    private Context context;

    public EtudiantAdapter(Context context, ArrayList<Etudiant> etudiantList) {
        super(context, 0, etudiantList);
        this.context = context;
        this.etudiantList = etudiantList;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Obtenir l'objet Etudiant pour cette position
        Etudiant etudiant = getItem(position);

        // Vérifier si la vue est réutilisée, sinon l'inflater
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item, parent, false);
        }

        // Récupérer les vues à remplir à partir de l'élément Etudiant
        TextView nomTextView = convertView.findViewById(R.id.nom);
        TextView prenomTextView = convertView.findViewById(R.id.prenom);
        TextView villeTextView = convertView.findViewById(R.id.ville);
        TextView sexeTextView = convertView.findViewById(R.id.sexe);


        // Remplir les vues avec les données de l'Etudiant
        if (etudiant != null) {
            nomTextView.setText(etudiant.getNom());
            prenomTextView.setText(etudiant.getPrenom());
            villeTextView.setText(etudiant.getVille());
            sexeTextView.setText(etudiant.getSexe());

        }

        return convertView;
    }
}
