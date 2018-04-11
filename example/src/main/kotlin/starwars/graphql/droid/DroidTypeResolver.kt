package starwars.graphql.droid

import com.coxautodev.graphql.tools.GraphQLResolver
import org.apache.tinkerpop.gremlin.ogm.GraphMapper
import org.springframework.stereotype.Component
import starwars.graphql.character.CharacterTypeResolver
import starwars.models.Droid

@Component
class DroidTypeResolver(
        override val graph: GraphMapper
): CharacterTypeResolver, GraphQLResolver<Droid> {

    fun getPrimaryFunction(droid: Droid): String = droid.primaryFunction

    // These redundant overrides are necessary for graphql.tools
    fun getId(node: Droid) = super.getId(node)
    fun getName(character: Droid) = super.getName(character)
    fun getAppearsIn(character: Droid) = super.getAppearsIn(character)
    fun getFriends(character: Droid) = super.getFriends(character)
    fun getSecondDegreeFriends(character: Droid, limit: Int?) = super.getSecondDegreeFriends(character, limit)
}