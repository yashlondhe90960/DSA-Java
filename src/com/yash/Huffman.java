package com.yash;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Huffman {
    public static void encode_huffman(Huffman_Node root_node, String str,
                                      Map<Character, String> huffman_Code)
    {
        if (root_node == null) {
            return;
        }

        // if the root node is a leaf node
        if (is_Leaf(root_node)) {
            huffman_Code.put(root_node.charac, str.length() > 0 ? str : "1");
        }

        encode_huffman(root_node.left, str + '0', huffman_Code);
        encode_huffman(root_node.right, str + '1', huffman_Code);
    }


    public static int decode_huffman(Huffman_Node root_node, int index, StringBuilder sb)
    {
        if (root_node == null) {
            return index;
        }

        if (is_Leaf(root_node))
        {
            System.out.print(root_node.charac);
            return index;
        }

        index++;

        root_node = (sb.charAt(index) == '0') ? root_node.left : root_node.right;
        index = decode_huffman(root_node, index, sb);
        return index;
    }

    public static boolean is_Leaf(Huffman_Node root_node) {
        return root_node.left == null && root_node.right == null;
    }

    public static void Main_Build_HuffmanTree(String text)
    {
        if (text == null || text.length() == 0) {
            return;
        }


        Map<Character, Integer> frequency = new HashMap<>();
        for (char c: text.toCharArray()) {
            frequency.put(c, frequency.getOrDefault(c, 0) + 1);
        }


        PriorityQueue<Huffman_Node> prio_queue;
        prio_queue = new PriorityQueue<>(Comparator.comparingInt(l -> l.frequency));


        for (var entry: frequency.entrySet()) {
            prio_queue.add(new Huffman_Node(entry.getKey(), entry.getValue()));
        }

        while (prio_queue.size() != 1)
        {

            Huffman_Node left = prio_queue.poll();
            Huffman_Node right = prio_queue.poll();

            int sum = left.frequency + right.frequency;
            prio_queue.add(new Huffman_Node(null, sum, left, right));
        }

        Huffman_Node root_node = prio_queue.peek();

        Map<Character, String> huffmanCode = new HashMap<>();
        encode_huffman(root_node, "", huffmanCode);

        System.out.println("The Huffman Codes for the given text are: " + huffmanCode);
        System.out.println("The original text is: " + text);

        StringBuilder sb = new StringBuilder();
        for (char c: text.toCharArray()) {
            sb.append(huffmanCode.get(c));
        }

        System.out.println("The encoded text is: " + sb);
        System.out.print("The decoded text is: ");

        if (is_Leaf(root_node))
        {
            while (root_node.frequency-- > 0) {
                System.out.print(root_node.charac);
            }
        }
        else {
            int index = -1;
            while (index < sb.length() - 1) {
                index = decode_huffman(root_node, index, sb);
            }
        }
    }

    public static void main(String[] args)
    {
        String text = "This is Yash Londhe";
        Main_Build_HuffmanTree(text);
    }
}