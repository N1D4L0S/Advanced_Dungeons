package greymerk.roguelike.dungeon.tasks;

import java.util.Random;

import greymerk.roguelike.dungeon.IDungeon;
import greymerk.roguelike.dungeon.settings.ISettings;
import greymerk.roguelike.worldgen.IWorldEditor;

public interface IDungeonTask {

	public boolean execute(IWorldEditor editor, Random rand, IDungeon dungeon, ISettings settings, int index);
	
}
