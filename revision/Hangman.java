package com.revision;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Hangman {
    public static void main(String[] args) {
        String[] words = {"java", "programming", "hangman", "developer", "computer"};
        String word = words[(int) (Math.random() * words.length)];
        Set<Character> guessedLetters = new HashSet<>();
        int attempts = 6;
        boolean wordGuessed = false;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Hangman!");

        while (attempts > 0 && !wordGuessed) {
            System.out.print("Word: ");
            boolean allLettersGuessed = true;
            for (char letter : word.toCharArray()) {
                if (guessedLetters.contains(letter)) {
                    System.out.print(letter + " ");
                } else {
                    System.out.print("_ ");
                    allLettersGuessed = false;
                }
            }
            System.out.println();

            if (allLettersGuessed) {
                wordGuessed = true;
                break;
            }

            System.out.print("Guess a letter: ");
            char guess = scanner.nextLine().charAt(0);

            if (guessedLetters.contains(guess)) {
                System.out.println("You already guessed that letter.");
            } else if (word.indexOf(guess) == -1) {
                System.out.println("Incorrect guess.");
                attempts--;
            } else {
                System.out.println("Correct guess.");
            }

            guessedLetters.add(guess);
            System.out.println("Attempts remaining: " + attempts);
        }

        if (wordGuessed) {
            System.out.println("Congratulations! You guessed the word: " + word);
        } else {
            System.out.println("Game over. The word was: " + word);
        }

        scanner.close();
    }
}

