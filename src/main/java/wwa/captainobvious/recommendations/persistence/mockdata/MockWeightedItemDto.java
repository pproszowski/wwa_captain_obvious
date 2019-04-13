package wwa.captainobvious.recommendations.persistence.mockdata;

import wwa.captainobvious.recommendations.persistence.dtos.WeightedItemDto;
import wwa.captainobvious.recommendations.web.dtos.ItemDto;

import java.util.Arrays;
import java.util.List;

public final class MockWeightedItemDto {

    private MockWeightedItemDto() {
    }

    public static List<WeightedItemDto> givenWeightedItems() {
        return Arrays.asList(new WeightedItemDto(0.5,
                                                 0.5,
                                                 0.5,
                                                 0.5,
                                                 new ItemDto("0",
                                                             "Dysk SEAGATE BarraCuda 1TB 7200obr. 64MB SATA 3",
                                                             "0",
                                                             "https://b.allegroimg"
                                                             + ".com/s128/01391f/e9825b704e9d920dea5c4b6037ab",
                                                             189,
                                                             1)),
                             new WeightedItemDto(0.5,
                                                 0.5,
                                                 0.5,
                                                 0.5,
                                                 new ItemDto("1",
                                                             "Listwa zasilająca CyberPower SB0501BA-FR 5 gniazd",
                                                             "1",
                                                             "https://8.allegroimg"
                                                             + ".com/s128/036344/351c389045e1a016e2164286c278",
                                                             40,
                                                             1)),
                             new WeightedItemDto(0.5,
                                                 0.5,
                                                 0.5,
                                                 0.5,
                                                 new ItemDto("2",
                                                             "OUTLET Zasilacz EATON 5E 650VA / 360W AVR 4 x IEC",
                                                             "2",
                                                             "https://a.allegroimg"
                                                             + ".com/s128/03af98/0927f143458fb3267d7bb2ee17ea",
                                                             139,
                                                             1)),
                             new WeightedItemDto(0.5,
                                                 0.5,
                                                 0.5,
                                                 0.5,
                                                 new ItemDto("3",
                                                             "Karta sieciowa USB TP-LINK TL-WN725N nano 150Mb/s",
                                                             "3",
                                                             "https://a.allegroimg"
                                                             + ".com/s128/018fde/8b965a79455d80d80ad9b28ce509",
                                                             30,
                                                             1)),
                             new WeightedItemDto(0.5,
                                                 0.5,
                                                 0.5,
                                                 0.5,
                                                 new ItemDto("4",
                                                             "Biały switch TP-LINK TL-SF1005D 5-portowy 100Mbps",
                                                             "4",
                                                             "https://9.allegroimg"
                                                             + ".com/s128/0161b4/5f2eee514ca4a8f5c806a3638019",
                                                             36,
                                                             1)),
                             new WeightedItemDto(0.5,
                                                 0.5,
                                                 0.5,
                                                 0.5,
                                                 new ItemDto("5",
                                                             "Obudowa SHIRU do dysku 2,5'' USB 3.0 aluminium",
                                                             "5",
                                                             "https://a.allegroimg"
                                                             + ".com/s128/01adeb/3ecde3f245f1938c8dfcc97fedda",
                                                             49,
                                                             1)),
                             new WeightedItemDto(0.5,
                                                 0.5,
                                                 0.5,
                                                 0.5,
                                                 new ItemDto("6",
                                                             "Kabel SATA/SATA Gembird 1 metr do dysków SATA III",
                                                             "6",
                                                             "https://7.allegroimg"
                                                             + ".com/s128/0638c7/762858a74a4ea2b3f4e7e8b858b7",
                                                             12,
                                                             1)),
                             new WeightedItemDto(0.5,
                                                 0.5,
                                                 0.5,
                                                 0.5,
                                                 new ItemDto("7",
                                                             "OUTLET ASUS VivoMINI UN65H i3-6100U Barebone",
                                                             "7",
                                                             "https://b.allegroimg"
                                                             + ".com/s128/06e6f1/206f881043bea333f168a6a3b33b",
                                                             849,
                                                             1)),
                             new WeightedItemDto(0.5,
                                                 0.5,
                                                 0.5,
                                                 0.5,
                                                 new ItemDto("8",
                                                             "Oprogramowanie Kaspersky Anti-Virus BOX 3st/12m PC",
                                                             "8",
                                                             "https://6.allegroimg"
                                                             + ".com/s128/03f775/a53dd7cb4aa19c4002f740f52aa6",
                                                             119,
                                                             1)),
                             new WeightedItemDto(0.5,
                                                 0.5,
                                                 0.5,
                                                 0.5,
                                                 new ItemDto("9",
                                                             "Podkładka Pod Mysz SteelSeries QcK Mini 210x250mm",
                                                             "9",
                                                             "https://3.allegroimg"
                                                             + ".com/s128/069e55/485f04e64516acda23724815bee3",
                                                             39,
                                                             1)));
    }
}
