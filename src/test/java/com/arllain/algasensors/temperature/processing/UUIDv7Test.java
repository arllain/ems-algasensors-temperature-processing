package com.arllain.algasensors.temperature.processing;

import com.arllain.algasensors.temperature.processing.common.IdGenerator;
import com.arllain.algasensors.temperature.processing.common.UUIDv7Utils;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;
import java.time.temporal.ChronoUnit;
import java.util.UUID;

class UUIDv7Test {

    @Test
    void shouldGenerateUUIDv7() {
        UUID uuid = IdGenerator.generateTimeBasedUUID();
//        UUID uuid1 = IdGenerator.generateTimeBasedUUIE();
//        UUID uuid2 = IdGenerator.generateTimeBasedUUIE();
//        UUID uuid3 = IdGenerator.generateTimeBasedUUIE();
//        UUID uuid4 = IdGenerator.generateTimeBasedUUIE();

//        System.out.println(UUIDv7Utils.extractOffsetDateTime(uuid1));
//        System.out.println(UUIDv7Utils.extractOffsetDateTime(uuid2));
//        System.out.println(UUIDv7Utils.extractOffsetDateTime(uuid3));
//        System.out.println(UUIDv7Utils.extractOffsetDateTime(uuid4));

        OffsetDateTime uuidDateTime = UUIDv7Utils.extractOffsetDateTime(uuid).truncatedTo(ChronoUnit.MINUTES);
        OffsetDateTime currentDateTime = OffsetDateTime.now().truncatedTo(ChronoUnit.MINUTES);

        Assertions.assertThat(uuidDateTime).isEqualTo(currentDateTime);

    }
}
