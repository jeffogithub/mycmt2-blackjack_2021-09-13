package com.jitterted.ebp.blackjack;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CardDisplayTest {
    @Test
    public void displayTenAsString() {
        Card card = new Card(Suit.DIAMONDS, Rank.TEN);
        String display = ConsoleCard.display(card);
        assertThat(display)
                .isEqualTo("[31m┌─────────┐[1B[11D│10       │[1B[11D│         │[1B[11D│    ♦    │[1B[11D│         │[1B[11D│       10│[1B[11D└─────────┘");
    }

    @Test
    public void displayNonTenAsString() {
        Card card = new Card(Suit.DIAMONDS, Rank.SEVEN);
        String display = ConsoleCard.display(card);
        assertThat(display)
                .isEqualTo("[31m┌─────────┐[1B[11D│7        │[1B[11D│         │[1B[11D│    ♦    │[1B[11D│         │[1B[11D│        7│[1B[11D└─────────┘");
    }
}