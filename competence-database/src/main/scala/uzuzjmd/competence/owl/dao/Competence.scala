package uzuzjmd.competence.owl.dao

import uzuzjmd.competence.owl.access.CompOntologyManager
import uzuzjmd.competence.owl.ontology.CompObjectProperties
import uzuzjmd.competence.owl.ontology.CompOntClass

class Competence(compManager: CompOntologyManager, identifier: String, val definition: String = null, val compulsory: java.lang.Boolean = null) extends CompetenceOntologySingletonDao(compManager, CompOntClass.Competence, identifier) {

  def DEFINITION = "definition"
  def COMPULSORY = "compulsory"

  @Override
  protected def persistMore() {
    val competenceRoot = new CompetenceInstance(comp)
    persist(false).getOntclass().addSuperClass(competenceRoot.persist(false).getOntclass())
  }

  @Override
  def getFullDao(): Dao = {
    return new Competence(compManager, identifier, getDataField(DEFINITION).toString(), getDataFieldBoolean(COMPULSORY))
  }

}