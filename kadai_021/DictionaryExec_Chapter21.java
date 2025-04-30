package kadai_021;

public class DictionaryExec_Chapter21 {

    public static void main(String[] args) {
        // 辞書クラスのインスタンス作成
        Dictionary_Chapter21 dictionary = new Dictionary_Chapter21();

        // 調べたい英単語を配列にセット
        String[] wordsToSearch = {"apple", "banana", "grape", "orange"};

        // 各単語について辞書を検索して出力
        for (String word : wordsToSearch) {
            String result = dictionary.search(word);
            System.out.println(word + "の意味は" + result);
        }
    }
}
