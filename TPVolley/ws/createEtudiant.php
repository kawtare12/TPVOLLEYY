<?php
if($_SERVER["REQUEST_METHOD"] == "POST"){
include_once '../racine.php';
include_once RACINE.'/service/EtudiantService.php';
create();
}
function create(){
extract($_POST);
$es = new EtudiantService();
$es->create(new Etudiant(1, $nom, $prenom, $ville, $sexe));
}