package com.neueda.jetbrains.plugin.graphdb.language.cypher.references.types;

import com.neueda.jetbrains.plugin.graphdb.language.cypher.completion.metadata.atoms.CypherType;

import static com.neueda.jetbrains.plugin.graphdb.language.cypher.completion.metadata.atoms.CypherSimpleType.PATH;

public interface CypherPathYielding extends CypherTyped {

    @Override
    default CypherType getType() {
        return PATH;
    }

}
