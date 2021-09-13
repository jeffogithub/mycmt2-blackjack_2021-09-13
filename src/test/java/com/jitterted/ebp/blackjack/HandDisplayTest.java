package com.jitterted.ebp.blackjack;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class HandDisplayTest {
    @Test
    public void displayFirstCard() {
        Hand hand = new Hand(List.of(new Card(Suit.HEARTS, Rank.ACE)));

        assertThat(Hand.displayFirstCard(hand))
                .isEqualTo("[31m┌─────────┐[1B[11D│A        │[1B[11D│         │[1B[11D│    ♥    │[1B[11D│         │[1B[11D│        A│[1B[11D└─────────┘");
    }

    @Test
    public void handAsString() {
        Hand hand = new Hand(List.of(new Card(Suit.HEARTS, Rank.ACE), new Card(Suit.DIAMONDS, Rank.ACE)));

        assertThat(ConsoleHand.cardsAsString(hand))
                .isEqualTo("\u001B[31m┌─────────┐\u001B[1B\u001B[11D│A        │\u001B[1B\u001B[11D│         │\u001B[1B\u001B[11D│    ♥    │\u001B[1B\u001B[11D│         │\u001B[1B\u001B[11D│        A│\u001B[1B\u001B[11D└─────────┘\u001B[6A\u001B[1C\u001B[31m┌─────────┐\u001B[1B\u001B[11D│A        │\u001B[1B\u001B[11D│         │\u001B[1B\u001B[11D│    ♦    │\u001B[1B\u001B[11D│         │\u001B[1B\u001B[11D│        A│\u001B[1B\u001B[11D└─────────┘");
    }
}