package org.example;

import java.time.Instant;

public record Task(ID.Valid id, String description, Instant deadline) {
}
