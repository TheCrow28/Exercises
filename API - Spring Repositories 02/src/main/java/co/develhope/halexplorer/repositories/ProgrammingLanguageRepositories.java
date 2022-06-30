package co.develhope.halexplorer.repositories;

import co.develhope.halexplorer.entities.ProgrammingLanguage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.Description;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "repo-prog-languages", collectionResourceDescription = @Description("Repository for ProgrammingLanguage table"))
public interface ProgrammingLanguageRepositories extends JpaRepository <ProgrammingLanguage, Long> {
}
