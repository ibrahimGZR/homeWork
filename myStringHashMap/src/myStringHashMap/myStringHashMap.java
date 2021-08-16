package myStringHashMap;

public class myStringHashMap {

	private String[] keys;
	private String[] texts;

	public myStringHashMap() {
		super();
		keys = new String[0];
		texts = new String[0];
	}

	public void put(String key, String value) {
		int a = this.keys.length;
		String[] tempKeys = new String[a + 1];
		String[] tempTexts = new String[a + 1];
		for (int i = 0; i < a; i++) {

			tempKeys[i] = this.keys[i];
			tempTexts[i] = this.texts[i];
		}

		tempKeys[a] = key;
		tempTexts[a] = value;

		this.keys = tempKeys;
		this.texts = tempTexts;

	}

	public String[] getData() {
		String[] array = new String[this.keys.length];
		for (int i = 0; i < this.keys.length; i++) {

			array[i] = this.keys[i] + "=" + this.texts[i];
		}

		return array;
	}

	public void remove(String key) {
		int a = this.keys.length;
		String[] tempKeys = new String[a - 1];
		String[] tempTexts = new String[a - 1];
		int j = 0;
		for (int i = 0; i < a - 1; i++) {
			if (this.keys[i] != key) {
				tempKeys[i] = this.keys[j];
				tempTexts[i] = this.texts[j];
				j++;
			}
			if (this.keys[i] == key) {
				j = i + 1;
				tempKeys[i] = this.keys[j];
				tempTexts[i] = this.texts[j];
				j++;
			}
		}
		this.keys = tempKeys;
		this.texts = tempTexts;
	}

	public String get(String key) {
		for (int i = 0; i < this.keys.length; i++) {
			if (this.keys[i] == key) {
				return this.texts[i];
			}
		}
		return null;
	}

	public void clear() {
		this.keys = new String[0];
		this.texts = new String[0];
	}
}
