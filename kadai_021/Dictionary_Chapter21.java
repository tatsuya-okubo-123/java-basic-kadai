package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
    private HashMap<String, String> dictionary;

    public Dictionary_Chapter21() {
        this.dictionary = new HashMap<>();
        // 辞書の初期化
        dictionary.put("apple", "りんご");
        dictionary.put("peach", "桃");
        dictionary.put("banana", "バナナ");
        dictionary.put("lemon", "レモン");
        dictionary.put("pear", "梨");
        dictionary.put("kiwi", "キウイ");
        dictionary.put("strawberry", "いちご");
        dictionary.put("grape", "ぶどう");
        dictionary.put("muscat", "マスカット");
        dictionary.put("cherry", "さくらんぼ");
    }

    // 全データ取得
    public void displayAll() {
        for (String key : dictionary.keySet()) {
            System.out.println(key + "の意味は" + dictionary.get(key));
        }
    }

    // 単語を検索するメソッド
    public String search(String word) {
        if (dictionary.containsKey(word)) {
            return dictionary.get(word);
        } else {
            return word + "は辞書に存在しません";
        }
    }
}