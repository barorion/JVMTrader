// Auto generated. Do not edit directly!
/*
 * Copyright (c) 2015. Suminda Sirinath Salpitikorala Dharmasena
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.susico.utils.arrays.tabled.arrayfloat.immutable;

import com.susico.utils.arrays.tabled.TabledArray;

public abstract class ImmutableTabledArrayFloat extends TabledArray {
    protected final float[] rest;

    protected ImmutableTabledArrayFloat(final boolean checked, final int definedAsValues, final float ... values) {
        super(checked, definedAsValues, values.length);
        this.rest = new float[length > definedAsValues ? length - definedAsValues : 0];

        if (rest.length > 0)
            System.arraycopy(values, definedAsValues, rest, 0, rest.length);
    }

    public abstract float get(final int index);

    protected final float getFromRest(int index) {
        return (float) ARRAY_ACCESS.get(rest, index - definedAsValues);
    }

    public static  ImmutableTabledArrayFloat getInstance(final boolean checked, final int length, final float ... values) {
        switch (length) {
            case 0:
                return ImmutableTabledArray0000Float.getInstance(checked, values);
            case 1:
                return ImmutableTabledArray0001Float.getInstance(checked, values);
            case 2: 
                return ImmutableTabledArray0002Float.getInstance(checked, values);

            case 3: case 4: 
                return ImmutableTabledArray0004Float.getInstance(checked, values);

            case 5: case 6: case 7: case 8: 
                return ImmutableTabledArray0008Float.getInstance(checked, values);

            case 9: case 10: case 11: case 12: case 13: case 14: case 15: 
            case 16: 
                return ImmutableTabledArray0016Float.getInstance(checked, values);

            case 17: case 18: case 19: case 20: case 21: case 22: case 23: case 24: case 25: case 26: case 27: case 28: case 29: case 30: case 31: 
            case 32: 
                return ImmutableTabledArray0032Float.getInstance(checked, values);

            case 33: case 34: case 35: case 36: case 37: case 38: case 39: case 40: case 41: case 42: case 43: case 44: case 45: case 46: case 47: 
            case 48: case 49: case 50: case 51: case 52: case 53: case 54: case 55: case 56: case 57: case 58: case 59: case 60: case 61: case 62: case 63: 
            case 64: 
                return ImmutableTabledArray0064Float.getInstance(checked, values);

            case 65: case 66: case 67: case 68: case 69: case 70: case 71: case 72: case 73: case 74: case 75: case 76: case 77: case 78: case 79: 
            case 80: case 81: case 82: case 83: case 84: case 85: case 86: case 87: case 88: case 89: case 90: case 91: case 92: case 93: case 94: case 95: 
            case 96: case 97: case 98: case 99: case 100: case 101: case 102: case 103: case 104: case 105: case 106: case 107: case 108: case 109: case 110: case 111: 
            case 112: case 113: case 114: case 115: case 116: case 117: case 118: case 119: case 120: case 121: case 122: case 123: case 124: case 125: case 126: case 127: 
            case 128: 
                return ImmutableTabledArray0128Float.getInstance(checked, values);

            case 129: case 130: case 131: case 132: case 133: case 134: case 135: case 136: case 137: case 138: case 139: case 140: case 141: case 142: case 143: 
            case 144: case 145: case 146: case 147: case 148: case 149: case 150: case 151: case 152: case 153: case 154: case 155: case 156: case 157: case 158: case 159: 
            case 160: case 161: case 162: case 163: case 164: case 165: case 166: case 167: case 168: case 169: case 170: case 171: case 172: case 173: case 174: case 175: 
            case 176: case 177: case 178: case 179: case 180: case 181: case 182: case 183: case 184: case 185: case 186: case 187: case 188: case 189: case 190: case 191: 
            case 192: case 193: case 194: case 195: case 196: case 197: case 198: case 199: case 200: case 201: case 202: case 203: case 204: case 205: case 206: case 207: 
            case 208: case 209: case 210: case 211: case 212: case 213: case 214: case 215: case 216: case 217: case 218: case 219: case 220: case 221: case 222: case 223: 
            case 224: case 225: case 226: case 227: case 228: case 229: case 230: case 231: case 232: case 233: case 234: case 235: case 236: case 237: case 238: case 239: 
            case 240: case 241: case 242: case 243: case 244: case 245: case 246: case 247: case 248: case 249: case 250: case 251: case 252: case 253: case 254: case 255: 
            case 256: 
                return ImmutableTabledArray0256Float.getInstance(checked, values);

            case 257: case 258: case 259: case 260: case 261: case 262: case 263: case 264: case 265: case 266: case 267: case 268: case 269: case 270: case 271: 
            case 272: case 273: case 274: case 275: case 276: case 277: case 278: case 279: case 280: case 281: case 282: case 283: case 284: case 285: case 286: case 287: 
            case 288: case 289: case 290: case 291: case 292: case 293: case 294: case 295: case 296: case 297: case 298: case 299: case 300: case 301: case 302: case 303: 
            case 304: case 305: case 306: case 307: case 308: case 309: case 310: case 311: case 312: case 313: case 314: case 315: case 316: case 317: case 318: case 319: 
            case 320: case 321: case 322: case 323: case 324: case 325: case 326: case 327: case 328: case 329: case 330: case 331: case 332: case 333: case 334: case 335: 
            case 336: case 337: case 338: case 339: case 340: case 341: case 342: case 343: case 344: case 345: case 346: case 347: case 348: case 349: case 350: case 351: 
            case 352: case 353: case 354: case 355: case 356: case 357: case 358: case 359: case 360: case 361: case 362: case 363: case 364: case 365: case 366: case 367: 
            case 368: case 369: case 370: case 371: case 372: case 373: case 374: case 375: case 376: case 377: case 378: case 379: case 380: case 381: case 382: case 383: 
            case 384: case 385: case 386: case 387: case 388: case 389: case 390: case 391: case 392: case 393: case 394: case 395: case 396: case 397: case 398: case 399: 
            case 400: case 401: case 402: case 403: case 404: case 405: case 406: case 407: case 408: case 409: case 410: case 411: case 412: case 413: case 414: case 415: 
            case 416: case 417: case 418: case 419: case 420: case 421: case 422: case 423: case 424: case 425: case 426: case 427: case 428: case 429: case 430: case 431: 
            case 432: case 433: case 434: case 435: case 436: case 437: case 438: case 439: case 440: case 441: case 442: case 443: case 444: case 445: case 446: case 447: 
            case 448: case 449: case 450: case 451: case 452: case 453: case 454: case 455: case 456: case 457: case 458: case 459: case 460: case 461: case 462: case 463: 
            case 464: case 465: case 466: case 467: case 468: case 469: case 470: case 471: case 472: case 473: case 474: case 475: case 476: case 477: case 478: case 479: 
            case 480: case 481: case 482: case 483: case 484: case 485: case 486: case 487: case 488: case 489: case 490: case 491: case 492: case 493: case 494: case 495: 
            case 496: case 497: case 498: case 499: case 500: case 501: case 502: case 503: case 504: case 505: case 506: case 507: case 508: case 509: case 510: case 511: 
            case 512: 
                return ImmutableTabledArray0512Float.getInstance(checked, values);

            case 513: case 514: case 515: case 516: case 517: case 518: case 519: case 520: case 521: case 522: case 523: case 524: case 525: case 526: case 527: 
            case 528: case 529: case 530: case 531: case 532: case 533: case 534: case 535: case 536: case 537: case 538: case 539: case 540: case 541: case 542: case 543: 
            case 544: case 545: case 546: case 547: case 548: case 549: case 550: case 551: case 552: case 553: case 554: case 555: case 556: case 557: case 558: case 559: 
            case 560: case 561: case 562: case 563: case 564: case 565: case 566: case 567: case 568: case 569: case 570: case 571: case 572: case 573: case 574: case 575: 
            case 576: case 577: case 578: case 579: case 580: case 581: case 582: case 583: case 584: case 585: case 586: case 587: case 588: case 589: case 590: case 591: 
            case 592: case 593: case 594: case 595: case 596: case 597: case 598: case 599: case 600: case 601: case 602: case 603: case 604: case 605: case 606: case 607: 
            case 608: case 609: case 610: case 611: case 612: case 613: case 614: case 615: case 616: case 617: case 618: case 619: case 620: case 621: case 622: case 623: 
            case 624: case 625: case 626: case 627: case 628: case 629: case 630: case 631: case 632: case 633: case 634: case 635: case 636: case 637: case 638: case 639: 
            case 640: case 641: case 642: case 643: case 644: case 645: case 646: case 647: case 648: case 649: case 650: case 651: case 652: case 653: case 654: case 655: 
            case 656: case 657: case 658: case 659: case 660: case 661: case 662: case 663: case 664: case 665: case 666: case 667: case 668: case 669: case 670: case 671: 
            case 672: case 673: case 674: case 675: case 676: case 677: case 678: case 679: case 680: case 681: case 682: case 683: case 684: case 685: case 686: case 687: 
            case 688: case 689: case 690: case 691: case 692: case 693: case 694: case 695: case 696: case 697: case 698: case 699: case 700: case 701: case 702: case 703: 
            case 704: case 705: case 706: case 707: case 708: case 709: case 710: case 711: case 712: case 713: case 714: case 715: case 716: case 717: case 718: case 719: 
            case 720: case 721: case 722: case 723: case 724: case 725: case 726: case 727: case 728: case 729: case 730: case 731: case 732: case 733: case 734: case 735: 
            case 736: case 737: case 738: case 739: case 740: case 741: case 742: case 743: case 744: case 745: case 746: case 747: case 748: case 749: case 750: case 751: 
            case 752: case 753: case 754: case 755: case 756: case 757: case 758: case 759: case 760: case 761: case 762: case 763: case 764: case 765: case 766: case 767: 
            case 768: case 769: case 770: case 771: case 772: case 773: case 774: case 775: case 776: case 777: case 778: case 779: case 780: case 781: case 782: case 783: 
            case 784: case 785: case 786: case 787: case 788: case 789: case 790: case 791: case 792: case 793: case 794: case 795: case 796: case 797: case 798: case 799: 
            case 800: case 801: case 802: case 803: case 804: case 805: case 806: case 807: case 808: case 809: case 810: case 811: case 812: case 813: case 814: case 815: 
            case 816: case 817: case 818: case 819: case 820: case 821: case 822: case 823: case 824: case 825: case 826: case 827: case 828: case 829: case 830: case 831: 
            case 832: case 833: case 834: case 835: case 836: case 837: case 838: case 839: case 840: case 841: case 842: case 843: case 844: case 845: case 846: case 847: 
            case 848: case 849: case 850: case 851: case 852: case 853: case 854: case 855: case 856: case 857: case 858: case 859: case 860: case 861: case 862: case 863: 
            case 864: case 865: case 866: case 867: case 868: case 869: case 870: case 871: case 872: case 873: case 874: case 875: case 876: case 877: case 878: case 879: 
            case 880: case 881: case 882: case 883: case 884: case 885: case 886: case 887: case 888: case 889: case 890: case 891: case 892: case 893: case 894: case 895: 
            case 896: case 897: case 898: case 899: case 900: case 901: case 902: case 903: case 904: case 905: case 906: case 907: case 908: case 909: case 910: case 911: 
            case 912: case 913: case 914: case 915: case 916: case 917: case 918: case 919: case 920: case 921: case 922: case 923: case 924: case 925: case 926: case 927: 
            case 928: case 929: case 930: case 931: case 932: case 933: case 934: case 935: case 936: case 937: case 938: case 939: case 940: case 941: case 942: case 943: 
            case 944: case 945: case 946: case 947: case 948: case 949: case 950: case 951: case 952: case 953: case 954: case 955: case 956: case 957: case 958: case 959: 
            case 960: case 961: case 962: case 963: case 964: case 965: case 966: case 967: case 968: case 969: case 970: case 971: case 972: case 973: case 974: case 975: 
            case 976: case 977: case 978: case 979: case 980: case 981: case 982: case 983: case 984: case 985: case 986: case 987: case 988: case 989: case 990: case 991: 
            case 992: case 993: case 994: case 995: case 996: case 997: case 998: case 999: case 1000: case 1001: case 1002: case 1003: case 1004: case 1005: case 1006: case 1007: 
            case 1008: case 1009: case 1010: case 1011: case 1012: case 1013: case 1014: case 1015: case 1016: case 1017: case 1018: case 1019: case 1020: case 1021: case 1022: case 1023: 
            case 1024: 
                return ImmutableTabledArray1024Float.getInstance(checked, values);

            case 1025: case 1026: case 1027: case 1028: case 1029: case 1030: case 1031: case 1032: case 1033: case 1034: case 1035: case 1036: case 1037: case 1038: case 1039: 
            case 1040: case 1041: case 1042: case 1043: case 1044: case 1045: case 1046: case 1047: case 1048: case 1049: case 1050: case 1051: case 1052: case 1053: case 1054: case 1055: 
            case 1056: case 1057: case 1058: case 1059: case 1060: case 1061: case 1062: case 1063: case 1064: case 1065: case 1066: case 1067: case 1068: case 1069: case 1070: case 1071: 
            case 1072: case 1073: case 1074: case 1075: case 1076: case 1077: case 1078: case 1079: case 1080: case 1081: case 1082: case 1083: case 1084: case 1085: case 1086: case 1087: 
            case 1088: case 1089: case 1090: case 1091: case 1092: case 1093: case 1094: case 1095: case 1096: case 1097: case 1098: case 1099: case 1100: case 1101: case 1102: case 1103: 
            case 1104: case 1105: case 1106: case 1107: case 1108: case 1109: case 1110: case 1111: case 1112: case 1113: case 1114: case 1115: case 1116: case 1117: case 1118: case 1119: 
            case 1120: case 1121: case 1122: case 1123: case 1124: case 1125: case 1126: case 1127: case 1128: case 1129: case 1130: case 1131: case 1132: case 1133: case 1134: case 1135: 
            case 1136: case 1137: case 1138: case 1139: case 1140: case 1141: case 1142: case 1143: case 1144: case 1145: case 1146: case 1147: case 1148: case 1149: case 1150: case 1151: 
            case 1152: case 1153: case 1154: case 1155: case 1156: case 1157: case 1158: case 1159: case 1160: case 1161: case 1162: case 1163: case 1164: case 1165: case 1166: case 1167: 
            case 1168: case 1169: case 1170: case 1171: case 1172: case 1173: case 1174: case 1175: case 1176: case 1177: case 1178: case 1179: case 1180: case 1181: case 1182: case 1183: 
            case 1184: case 1185: case 1186: case 1187: case 1188: case 1189: case 1190: case 1191: case 1192: case 1193: case 1194: case 1195: case 1196: case 1197: case 1198: case 1199: 
            case 1200: case 1201: case 1202: case 1203: case 1204: case 1205: case 1206: case 1207: case 1208: case 1209: case 1210: case 1211: case 1212: case 1213: case 1214: case 1215: 
            case 1216: case 1217: case 1218: case 1219: case 1220: case 1221: case 1222: case 1223: case 1224: case 1225: case 1226: case 1227: case 1228: case 1229: case 1230: case 1231: 
            case 1232: case 1233: case 1234: case 1235: case 1236: case 1237: case 1238: case 1239: case 1240: case 1241: case 1242: case 1243: case 1244: case 1245: case 1246: case 1247: 
            case 1248: case 1249: case 1250: case 1251: case 1252: case 1253: case 1254: case 1255: case 1256: case 1257: case 1258: case 1259: case 1260: case 1261: case 1262: case 1263: 
            case 1264: case 1265: case 1266: case 1267: case 1268: case 1269: case 1270: case 1271: case 1272: case 1273: case 1274: case 1275: case 1276: case 1277: case 1278: case 1279: 
            case 1280: case 1281: case 1282: case 1283: case 1284: case 1285: case 1286: case 1287: case 1288: case 1289: case 1290: case 1291: case 1292: case 1293: case 1294: case 1295: 
            case 1296: case 1297: case 1298: case 1299: case 1300: case 1301: case 1302: case 1303: case 1304: case 1305: case 1306: case 1307: case 1308: case 1309: case 1310: case 1311: 
            case 1312: case 1313: case 1314: case 1315: case 1316: case 1317: case 1318: case 1319: case 1320: case 1321: case 1322: case 1323: case 1324: case 1325: case 1326: case 1327: 
            case 1328: case 1329: case 1330: case 1331: case 1332: case 1333: case 1334: case 1335: case 1336: case 1337: case 1338: case 1339: case 1340: case 1341: case 1342: case 1343: 
            case 1344: case 1345: case 1346: case 1347: case 1348: case 1349: case 1350: case 1351: case 1352: case 1353: case 1354: case 1355: case 1356: case 1357: case 1358: case 1359: 
            case 1360: case 1361: case 1362: case 1363: case 1364: case 1365: case 1366: case 1367: case 1368: case 1369: case 1370: case 1371: case 1372: case 1373: case 1374: case 1375: 
            case 1376: case 1377: case 1378: case 1379: case 1380: case 1381: case 1382: case 1383: case 1384: case 1385: case 1386: case 1387: case 1388: case 1389: case 1390: case 1391: 
            case 1392: case 1393: case 1394: case 1395: case 1396: case 1397: case 1398: case 1399: case 1400: case 1401: case 1402: case 1403: case 1404: case 1405: case 1406: case 1407: 
            case 1408: case 1409: case 1410: case 1411: case 1412: case 1413: case 1414: case 1415: case 1416: case 1417: case 1418: case 1419: case 1420: case 1421: case 1422: case 1423: 
            case 1424: case 1425: case 1426: case 1427: case 1428: case 1429: case 1430: case 1431: case 1432: case 1433: case 1434: case 1435: case 1436: case 1437: case 1438: case 1439: 
            case 1440: case 1441: case 1442: case 1443: case 1444: case 1445: case 1446: case 1447: case 1448: case 1449: case 1450: case 1451: case 1452: case 1453: case 1454: case 1455: 
            case 1456: case 1457: case 1458: case 1459: case 1460: case 1461: case 1462: case 1463: case 1464: case 1465: case 1466: case 1467: case 1468: case 1469: case 1470: case 1471: 
            case 1472: case 1473: case 1474: case 1475: case 1476: case 1477: case 1478: case 1479: case 1480: case 1481: case 1482: case 1483: case 1484: case 1485: case 1486: case 1487: 
            case 1488: case 1489: case 1490: case 1491: case 1492: case 1493: case 1494: case 1495: case 1496: case 1497: case 1498: case 1499: case 1500: case 1501: case 1502: case 1503: 
            case 1504: case 1505: case 1506: case 1507: case 1508: case 1509: case 1510: case 1511: case 1512: case 1513: case 1514: case 1515: case 1516: case 1517: case 1518: case 1519: 
            case 1520: case 1521: case 1522: case 1523: case 1524: case 1525: case 1526: case 1527: case 1528: case 1529: case 1530: case 1531: case 1532: case 1533: case 1534: case 1535: 
            case 1536: case 1537: case 1538: case 1539: case 1540: case 1541: case 1542: case 1543: case 1544: case 1545: case 1546: case 1547: case 1548: case 1549: case 1550: case 1551: 
            case 1552: case 1553: case 1554: case 1555: case 1556: case 1557: case 1558: case 1559: case 1560: case 1561: case 1562: case 1563: case 1564: case 1565: case 1566: case 1567: 
            case 1568: case 1569: case 1570: case 1571: case 1572: case 1573: case 1574: case 1575: case 1576: case 1577: case 1578: case 1579: case 1580: case 1581: case 1582: case 1583: 
            case 1584: case 1585: case 1586: case 1587: case 1588: case 1589: case 1590: case 1591: case 1592: case 1593: case 1594: case 1595: case 1596: case 1597: case 1598: case 1599: 
            case 1600: case 1601: case 1602: case 1603: case 1604: case 1605: case 1606: case 1607: case 1608: case 1609: case 1610: case 1611: case 1612: case 1613: case 1614: case 1615: 
            case 1616: case 1617: case 1618: case 1619: case 1620: case 1621: case 1622: case 1623: case 1624: case 1625: case 1626: case 1627: case 1628: case 1629: case 1630: case 1631: 
            case 1632: case 1633: case 1634: case 1635: case 1636: case 1637: case 1638: case 1639: case 1640: case 1641: case 1642: case 1643: case 1644: case 1645: case 1646: case 1647: 
            case 1648: case 1649: case 1650: case 1651: case 1652: case 1653: case 1654: case 1655: case 1656: case 1657: case 1658: case 1659: case 1660: case 1661: case 1662: case 1663: 
            case 1664: case 1665: case 1666: case 1667: case 1668: case 1669: case 1670: case 1671: case 1672: case 1673: case 1674: case 1675: case 1676: case 1677: case 1678: case 1679: 
            case 1680: case 1681: case 1682: case 1683: case 1684: case 1685: case 1686: case 1687: case 1688: case 1689: case 1690: case 1691: case 1692: case 1693: case 1694: case 1695: 
            case 1696: case 1697: case 1698: case 1699: case 1700: case 1701: case 1702: case 1703: case 1704: case 1705: case 1706: case 1707: case 1708: case 1709: case 1710: case 1711: 
            case 1712: case 1713: case 1714: case 1715: case 1716: case 1717: case 1718: case 1719: case 1720: case 1721: case 1722: case 1723: case 1724: case 1725: case 1726: case 1727: 
            case 1728: case 1729: case 1730: case 1731: case 1732: case 1733: case 1734: case 1735: case 1736: case 1737: case 1738: case 1739: case 1740: case 1741: case 1742: case 1743: 
            case 1744: case 1745: case 1746: case 1747: case 1748: case 1749: case 1750: case 1751: case 1752: case 1753: case 1754: case 1755: case 1756: case 1757: case 1758: case 1759: 
            case 1760: case 1761: case 1762: case 1763: case 1764: case 1765: case 1766: case 1767: case 1768: case 1769: case 1770: case 1771: case 1772: case 1773: case 1774: case 1775: 
            case 1776: case 1777: case 1778: case 1779: case 1780: case 1781: case 1782: case 1783: case 1784: case 1785: case 1786: case 1787: case 1788: case 1789: case 1790: case 1791: 
            case 1792: case 1793: case 1794: case 1795: case 1796: case 1797: case 1798: case 1799: case 1800: case 1801: case 1802: case 1803: case 1804: case 1805: case 1806: case 1807: 
            case 1808: case 1809: case 1810: case 1811: case 1812: case 1813: case 1814: case 1815: case 1816: case 1817: case 1818: case 1819: case 1820: case 1821: case 1822: case 1823: 
            case 1824: case 1825: case 1826: case 1827: case 1828: case 1829: case 1830: case 1831: case 1832: case 1833: case 1834: case 1835: case 1836: case 1837: case 1838: case 1839: 
            case 1840: case 1841: case 1842: case 1843: case 1844: case 1845: case 1846: case 1847: case 1848: case 1849: case 1850: case 1851: case 1852: case 1853: case 1854: case 1855: 
            case 1856: case 1857: case 1858: case 1859: case 1860: case 1861: case 1862: case 1863: case 1864: case 1865: case 1866: case 1867: case 1868: case 1869: case 1870: case 1871: 
            case 1872: case 1873: case 1874: case 1875: case 1876: case 1877: case 1878: case 1879: case 1880: case 1881: case 1882: case 1883: case 1884: case 1885: case 1886: case 1887: 
            case 1888: case 1889: case 1890: case 1891: case 1892: case 1893: case 1894: case 1895: case 1896: case 1897: case 1898: case 1899: case 1900: case 1901: case 1902: case 1903: 
            case 1904: case 1905: case 1906: case 1907: case 1908: case 1909: case 1910: case 1911: case 1912: case 1913: case 1914: case 1915: case 1916: case 1917: case 1918: case 1919: 
            case 1920: case 1921: case 1922: case 1923: case 1924: case 1925: case 1926: case 1927: case 1928: case 1929: case 1930: case 1931: case 1932: case 1933: case 1934: case 1935: 
            case 1936: case 1937: case 1938: case 1939: case 1940: case 1941: case 1942: case 1943: case 1944: case 1945: case 1946: case 1947: case 1948: case 1949: case 1950: case 1951: 
            case 1952: case 1953: case 1954: case 1955: case 1956: case 1957: case 1958: case 1959: case 1960: case 1961: case 1962: case 1963: case 1964: case 1965: case 1966: case 1967: 
            case 1968: case 1969: case 1970: case 1971: case 1972: case 1973: case 1974: case 1975: case 1976: case 1977: case 1978: case 1979: case 1980: case 1981: case 1982: case 1983: 
            case 1984: case 1985: case 1986: case 1987: case 1988: case 1989: case 1990: case 1991: case 1992: case 1993: case 1994: case 1995: case 1996: case 1997: case 1998: case 1999: 
            case 2000: case 2001: case 2002: case 2003: case 2004: case 2005: case 2006: case 2007: case 2008: case 2009: case 2010: case 2011: case 2012: case 2013: case 2014: case 2015: 
            case 2016: case 2017: case 2018: case 2019: case 2020: case 2021: case 2022: case 2023: case 2024: case 2025: case 2026: case 2027: case 2028: case 2029: case 2030: case 2031: 
            case 2032: case 2033: case 2034: case 2035: case 2036: case 2037: case 2038: case 2039: case 2040: case 2041: case 2042: case 2043: case 2044: case 2045: case 2046: case 2047: 
            case 2048: 
                return ImmutableTabledArray2048Float.getInstance(checked, values);

            case 2049: case 2050: case 2051: case 2052: case 2053: case 2054: case 2055: case 2056: case 2057: case 2058: case 2059: case 2060: case 2061: case 2062: case 2063: 
            case 2064: case 2065: case 2066: case 2067: case 2068: case 2069: case 2070: case 2071: case 2072: case 2073: case 2074: case 2075: case 2076: case 2077: case 2078: case 2079: 
            case 2080: case 2081: case 2082: case 2083: case 2084: case 2085: case 2086: case 2087: case 2088: case 2089: case 2090: case 2091: case 2092: case 2093: case 2094: case 2095: 
            case 2096: case 2097: case 2098: case 2099: case 2100: case 2101: case 2102: case 2103: case 2104: case 2105: case 2106: case 2107: case 2108: case 2109: case 2110: case 2111: 
            case 2112: case 2113: case 2114: case 2115: case 2116: case 2117: case 2118: case 2119: case 2120: case 2121: case 2122: case 2123: case 2124: case 2125: case 2126: case 2127: 
            case 2128: case 2129: case 2130: case 2131: case 2132: case 2133: case 2134: case 2135: case 2136: case 2137: case 2138: case 2139: case 2140: case 2141: case 2142: case 2143: 
            case 2144: case 2145: case 2146: case 2147: case 2148: case 2149: case 2150: case 2151: case 2152: case 2153: case 2154: case 2155: case 2156: case 2157: case 2158: case 2159: 
            case 2160: case 2161: case 2162: case 2163: case 2164: case 2165: case 2166: case 2167: case 2168: case 2169: case 2170: case 2171: case 2172: case 2173: case 2174: case 2175: 
            case 2176: case 2177: case 2178: case 2179: case 2180: case 2181: case 2182: case 2183: case 2184: case 2185: case 2186: case 2187: case 2188: case 2189: case 2190: case 2191: 
            case 2192: case 2193: case 2194: case 2195: case 2196: case 2197: case 2198: case 2199: case 2200: case 2201: case 2202: case 2203: case 2204: case 2205: case 2206: case 2207: 
            case 2208: case 2209: case 2210: case 2211: case 2212: case 2213: case 2214: case 2215: case 2216: case 2217: case 2218: case 2219: case 2220: case 2221: case 2222: case 2223: 
            case 2224: case 2225: case 2226: case 2227: case 2228: case 2229: case 2230: case 2231: case 2232: case 2233: case 2234: case 2235: case 2236: case 2237: case 2238: case 2239: 
            case 2240: case 2241: case 2242: case 2243: case 2244: case 2245: case 2246: case 2247: case 2248: case 2249: case 2250: case 2251: case 2252: case 2253: case 2254: case 2255: 
            case 2256: case 2257: case 2258: case 2259: case 2260: case 2261: case 2262: case 2263: case 2264: case 2265: case 2266: case 2267: case 2268: case 2269: case 2270: case 2271: 
            case 2272: case 2273: case 2274: case 2275: case 2276: case 2277: case 2278: case 2279: case 2280: case 2281: case 2282: case 2283: case 2284: case 2285: case 2286: case 2287: 
            case 2288: case 2289: case 2290: case 2291: case 2292: case 2293: case 2294: case 2295: case 2296: case 2297: case 2298: case 2299: case 2300: case 2301: case 2302: case 2303: 
            case 2304: case 2305: case 2306: case 2307: case 2308: case 2309: case 2310: case 2311: case 2312: case 2313: case 2314: case 2315: case 2316: case 2317: case 2318: case 2319: 
            case 2320: case 2321: case 2322: case 2323: case 2324: case 2325: case 2326: case 2327: case 2328: case 2329: case 2330: case 2331: case 2332: case 2333: case 2334: case 2335: 
            case 2336: case 2337: case 2338: case 2339: case 2340: case 2341: case 2342: case 2343: case 2344: case 2345: case 2346: case 2347: case 2348: case 2349: case 2350: case 2351: 
            case 2352: case 2353: case 2354: case 2355: case 2356: case 2357: case 2358: case 2359: case 2360: case 2361: case 2362: case 2363: case 2364: case 2365: case 2366: case 2367: 
            case 2368: case 2369: case 2370: case 2371: case 2372: case 2373: case 2374: case 2375: case 2376: case 2377: case 2378: case 2379: case 2380: case 2381: case 2382: case 2383: 
            case 2384: case 2385: case 2386: case 2387: case 2388: case 2389: case 2390: case 2391: case 2392: case 2393: case 2394: case 2395: case 2396: case 2397: case 2398: case 2399: 
            case 2400: case 2401: case 2402: case 2403: case 2404: case 2405: case 2406: case 2407: case 2408: case 2409: case 2410: case 2411: case 2412: case 2413: case 2414: case 2415: 
            case 2416: case 2417: case 2418: case 2419: case 2420: case 2421: case 2422: case 2423: case 2424: case 2425: case 2426: case 2427: case 2428: case 2429: case 2430: case 2431: 
            case 2432: case 2433: case 2434: case 2435: case 2436: case 2437: case 2438: case 2439: case 2440: case 2441: case 2442: case 2443: case 2444: case 2445: case 2446: case 2447: 
            case 2448: case 2449: case 2450: case 2451: case 2452: case 2453: case 2454: case 2455: case 2456: case 2457: case 2458: case 2459: case 2460: case 2461: case 2462: case 2463: 
            case 2464: case 2465: case 2466: case 2467: case 2468: case 2469: case 2470: case 2471: case 2472: case 2473: case 2474: case 2475: case 2476: case 2477: case 2478: case 2479: 
            case 2480: case 2481: case 2482: case 2483: case 2484: case 2485: case 2486: case 2487: case 2488: case 2489: case 2490: case 2491: case 2492: case 2493: case 2494: case 2495: 
            case 2496: case 2497: case 2498: case 2499: case 2500: case 2501: case 2502: case 2503: case 2504: case 2505: case 2506: case 2507: case 2508: case 2509: case 2510: case 2511: 
            case 2512: case 2513: case 2514: case 2515: case 2516: case 2517: case 2518: case 2519: case 2520: case 2521: case 2522: case 2523: case 2524: case 2525: case 2526: case 2527: 
            case 2528: case 2529: case 2530: case 2531: case 2532: case 2533: case 2534: case 2535: case 2536: case 2537: case 2538: case 2539: case 2540: case 2541: case 2542: case 2543: 
            case 2544: case 2545: case 2546: case 2547: case 2548: case 2549: case 2550: case 2551: case 2552: case 2553: case 2554: case 2555: case 2556: case 2557: case 2558: case 2559: 
            case 2560: case 2561: case 2562: case 2563: case 2564: case 2565: case 2566: case 2567: case 2568: case 2569: case 2570: case 2571: case 2572: case 2573: case 2574: case 2575: 
            case 2576: case 2577: case 2578: case 2579: case 2580: case 2581: case 2582: case 2583: case 2584: case 2585: case 2586: case 2587: case 2588: case 2589: case 2590: case 2591: 
            case 2592: case 2593: case 2594: case 2595: case 2596: case 2597: case 2598: case 2599: case 2600: case 2601: case 2602: case 2603: case 2604: case 2605: case 2606: case 2607: 
            case 2608: case 2609: case 2610: case 2611: case 2612: case 2613: case 2614: case 2615: case 2616: case 2617: case 2618: case 2619: case 2620: case 2621: case 2622: case 2623: 
            case 2624: case 2625: case 2626: case 2627: case 2628: case 2629: case 2630: case 2631: case 2632: case 2633: case 2634: case 2635: case 2636: case 2637: case 2638: case 2639: 
            case 2640: case 2641: case 2642: case 2643: case 2644: case 2645: case 2646: case 2647: case 2648: case 2649: case 2650: case 2651: case 2652: case 2653: case 2654: case 2655: 
            case 2656: case 2657: case 2658: case 2659: case 2660: case 2661: case 2662: case 2663: case 2664: case 2665: case 2666: case 2667: case 2668: case 2669: case 2670: case 2671: 
            case 2672: case 2673: case 2674: case 2675: case 2676: case 2677: case 2678: case 2679: case 2680: case 2681: case 2682: case 2683: case 2684: case 2685: case 2686: case 2687: 
            case 2688: case 2689: case 2690: case 2691: case 2692: case 2693: case 2694: case 2695: case 2696: case 2697: case 2698: case 2699: case 2700: case 2701: case 2702: case 2703: 
            case 2704: case 2705: case 2706: case 2707: case 2708: case 2709: case 2710: case 2711: case 2712: case 2713: case 2714: case 2715: case 2716: case 2717: case 2718: case 2719: 
            case 2720: case 2721: case 2722: case 2723: case 2724: case 2725: case 2726: case 2727: case 2728: case 2729: case 2730: case 2731: case 2732: case 2733: case 2734: case 2735: 
            case 2736: case 2737: case 2738: case 2739: case 2740: case 2741: case 2742: case 2743: case 2744: case 2745: case 2746: case 2747: case 2748: case 2749: case 2750: case 2751: 
            case 2752: case 2753: case 2754: case 2755: case 2756: case 2757: case 2758: case 2759: case 2760: case 2761: case 2762: case 2763: case 2764: case 2765: case 2766: case 2767: 
            case 2768: case 2769: case 2770: case 2771: case 2772: case 2773: case 2774: case 2775: case 2776: case 2777: case 2778: case 2779: case 2780: case 2781: case 2782: case 2783: 
            case 2784: case 2785: case 2786: case 2787: case 2788: case 2789: case 2790: case 2791: case 2792: case 2793: case 2794: case 2795: case 2796: case 2797: case 2798: case 2799: 
            case 2800: case 2801: case 2802: case 2803: case 2804: case 2805: case 2806: case 2807: case 2808: case 2809: case 2810: case 2811: case 2812: case 2813: case 2814: case 2815: 
            case 2816: case 2817: case 2818: case 2819: case 2820: case 2821: case 2822: case 2823: case 2824: case 2825: case 2826: case 2827: case 2828: case 2829: case 2830: case 2831: 
            case 2832: case 2833: case 2834: case 2835: case 2836: case 2837: case 2838: case 2839: case 2840: case 2841: case 2842: case 2843: case 2844: case 2845: case 2846: case 2847: 
            case 2848: case 2849: case 2850: case 2851: case 2852: case 2853: case 2854: case 2855: case 2856: case 2857: case 2858: case 2859: case 2860: case 2861: case 2862: case 2863: 
            case 2864: case 2865: case 2866: case 2867: case 2868: case 2869: case 2870: case 2871: case 2872: case 2873: case 2874: case 2875: case 2876: case 2877: case 2878: case 2879: 
            case 2880: case 2881: case 2882: case 2883: case 2884: case 2885: case 2886: case 2887: case 2888: case 2889: case 2890: case 2891: case 2892: case 2893: case 2894: case 2895: 
            case 2896: case 2897: case 2898: case 2899: case 2900: case 2901: case 2902: case 2903: case 2904: case 2905: case 2906: case 2907: case 2908: case 2909: case 2910: case 2911: 
            case 2912: case 2913: case 2914: case 2915: case 2916: case 2917: case 2918: case 2919: case 2920: case 2921: case 2922: case 2923: case 2924: case 2925: case 2926: case 2927: 
            case 2928: case 2929: case 2930: case 2931: case 2932: case 2933: case 2934: case 2935: case 2936: case 2937: case 2938: case 2939: case 2940: case 2941: case 2942: case 2943: 
            case 2944: case 2945: case 2946: case 2947: case 2948: case 2949: case 2950: case 2951: case 2952: case 2953: case 2954: case 2955: case 2956: case 2957: case 2958: case 2959: 
            case 2960: case 2961: case 2962: case 2963: case 2964: case 2965: case 2966: case 2967: case 2968: case 2969: case 2970: case 2971: case 2972: case 2973: case 2974: case 2975: 
            case 2976: case 2977: case 2978: case 2979: case 2980: case 2981: case 2982: case 2983: case 2984: case 2985: case 2986: case 2987: case 2988: case 2989: case 2990: case 2991: 
            case 2992: case 2993: case 2994: case 2995: case 2996: case 2997: case 2998: case 2999: case 3000: case 3001: case 3002: case 3003: case 3004: case 3005: case 3006: case 3007: 
            case 3008: case 3009: case 3010: case 3011: case 3012: case 3013: case 3014: case 3015: case 3016: case 3017: case 3018: case 3019: case 3020: case 3021: case 3022: case 3023: 
            case 3024: case 3025: case 3026: case 3027: case 3028: case 3029: case 3030: case 3031: case 3032: case 3033: case 3034: case 3035: case 3036: case 3037: case 3038: case 3039: 
            case 3040: case 3041: case 3042: case 3043: case 3044: case 3045: case 3046: case 3047: case 3048: case 3049: case 3050: case 3051: case 3052: case 3053: case 3054: case 3055: 
            case 3056: case 3057: case 3058: case 3059: case 3060: case 3061: case 3062: case 3063: case 3064: case 3065: case 3066: case 3067: case 3068: case 3069: case 3070: case 3071: 
            case 3072: case 3073: case 3074: case 3075: case 3076: case 3077: case 3078: case 3079: case 3080: case 3081: case 3082: case 3083: case 3084: case 3085: case 3086: case 3087: 
            case 3088: case 3089: case 3090: case 3091: case 3092: case 3093: case 3094: case 3095: case 3096: case 3097: case 3098: case 3099: case 3100: case 3101: case 3102: case 3103: 
            case 3104: case 3105: case 3106: case 3107: case 3108: case 3109: case 3110: case 3111: case 3112: case 3113: case 3114: case 3115: case 3116: case 3117: case 3118: case 3119: 
            case 3120: case 3121: case 3122: case 3123: case 3124: case 3125: case 3126: case 3127: case 3128: case 3129: case 3130: case 3131: case 3132: case 3133: case 3134: case 3135: 
            case 3136: case 3137: case 3138: case 3139: case 3140: case 3141: case 3142: case 3143: case 3144: case 3145: case 3146: case 3147: case 3148: case 3149: case 3150: case 3151: 
            case 3152: case 3153: case 3154: case 3155: case 3156: case 3157: case 3158: case 3159: case 3160: case 3161: case 3162: case 3163: case 3164: case 3165: case 3166: case 3167: 
            case 3168: case 3169: case 3170: case 3171: case 3172: case 3173: case 3174: case 3175: case 3176: case 3177: case 3178: case 3179: case 3180: case 3181: case 3182: case 3183: 
            case 3184: case 3185: case 3186: case 3187: case 3188: case 3189: case 3190: case 3191: case 3192: case 3193: case 3194: case 3195: case 3196: case 3197: case 3198: case 3199: 
            case 3200: case 3201: case 3202: case 3203: case 3204: case 3205: case 3206: case 3207: case 3208: case 3209: case 3210: case 3211: case 3212: case 3213: case 3214: case 3215: 
            case 3216: case 3217: case 3218: case 3219: case 3220: case 3221: case 3222: case 3223: case 3224: case 3225: case 3226: case 3227: case 3228: case 3229: case 3230: case 3231: 
            case 3232: case 3233: case 3234: case 3235: case 3236: case 3237: case 3238: case 3239: case 3240: case 3241: case 3242: case 3243: case 3244: case 3245: case 3246: case 3247: 
            case 3248: case 3249: case 3250: case 3251: case 3252: case 3253: case 3254: case 3255: case 3256: case 3257: case 3258: case 3259: case 3260: case 3261: case 3262: case 3263: 
            case 3264: case 3265: case 3266: case 3267: case 3268: case 3269: case 3270: case 3271: case 3272: case 3273: case 3274: case 3275: case 3276: case 3277: case 3278: case 3279: 
            case 3280: case 3281: case 3282: case 3283: case 3284: case 3285: case 3286: case 3287: case 3288: case 3289: case 3290: case 3291: case 3292: case 3293: case 3294: case 3295: 
            case 3296: case 3297: case 3298: case 3299: case 3300: case 3301: case 3302: case 3303: case 3304: case 3305: case 3306: case 3307: case 3308: case 3309: case 3310: case 3311: 
            case 3312: case 3313: case 3314: case 3315: case 3316: case 3317: case 3318: case 3319: case 3320: case 3321: case 3322: case 3323: case 3324: case 3325: case 3326: case 3327: 
            case 3328: case 3329: case 3330: case 3331: case 3332: case 3333: case 3334: case 3335: case 3336: case 3337: case 3338: case 3339: case 3340: case 3341: case 3342: case 3343: 
            case 3344: case 3345: case 3346: case 3347: case 3348: case 3349: case 3350: case 3351: case 3352: case 3353: case 3354: case 3355: case 3356: case 3357: case 3358: case 3359: 
            case 3360: case 3361: case 3362: case 3363: case 3364: case 3365: case 3366: case 3367: case 3368: case 3369: case 3370: case 3371: case 3372: case 3373: case 3374: case 3375: 
            case 3376: case 3377: case 3378: case 3379: case 3380: case 3381: case 3382: case 3383: case 3384: case 3385: case 3386: case 3387: case 3388: case 3389: case 3390: case 3391: 
            case 3392: case 3393: case 3394: case 3395: case 3396: case 3397: case 3398: case 3399: case 3400: case 3401: case 3402: case 3403: case 3404: case 3405: case 3406: case 3407: 
            case 3408: case 3409: case 3410: case 3411: case 3412: case 3413: case 3414: case 3415: case 3416: case 3417: case 3418: case 3419: case 3420: case 3421: case 3422: case 3423: 
            case 3424: case 3425: case 3426: case 3427: case 3428: case 3429: case 3430: case 3431: case 3432: case 3433: case 3434: case 3435: case 3436: case 3437: case 3438: case 3439: 
            case 3440: case 3441: case 3442: case 3443: case 3444: case 3445: case 3446: case 3447: case 3448: case 3449: case 3450: case 3451: case 3452: case 3453: case 3454: case 3455: 
            case 3456: case 3457: case 3458: case 3459: case 3460: case 3461: case 3462: case 3463: case 3464: case 3465: case 3466: case 3467: case 3468: case 3469: case 3470: case 3471: 
            case 3472: case 3473: case 3474: case 3475: case 3476: case 3477: case 3478: case 3479: case 3480: case 3481: case 3482: case 3483: case 3484: case 3485: case 3486: case 3487: 
            case 3488: case 3489: case 3490: case 3491: case 3492: case 3493: case 3494: case 3495: case 3496: case 3497: case 3498: case 3499: case 3500: case 3501: case 3502: case 3503: 
            case 3504: case 3505: case 3506: case 3507: case 3508: case 3509: case 3510: case 3511: case 3512: case 3513: case 3514: case 3515: case 3516: case 3517: case 3518: case 3519: 
            case 3520: case 3521: case 3522: case 3523: case 3524: case 3525: case 3526: case 3527: case 3528: case 3529: case 3530: case 3531: case 3532: case 3533: case 3534: case 3535: 
            case 3536: case 3537: case 3538: case 3539: case 3540: case 3541: case 3542: case 3543: case 3544: case 3545: case 3546: case 3547: case 3548: case 3549: case 3550: case 3551: 
            case 3552: case 3553: case 3554: case 3555: case 3556: case 3557: case 3558: case 3559: case 3560: case 3561: case 3562: case 3563: case 3564: case 3565: case 3566: case 3567: 
            case 3568: case 3569: case 3570: case 3571: case 3572: case 3573: case 3574: case 3575: case 3576: case 3577: case 3578: case 3579: case 3580: case 3581: case 3582: case 3583: 
            case 3584: case 3585: case 3586: case 3587: case 3588: case 3589: case 3590: case 3591: case 3592: case 3593: case 3594: case 3595: case 3596: case 3597: case 3598: case 3599: 
            case 3600: case 3601: case 3602: case 3603: case 3604: case 3605: case 3606: case 3607: case 3608: case 3609: case 3610: case 3611: case 3612: case 3613: case 3614: case 3615: 
            case 3616: case 3617: case 3618: case 3619: case 3620: case 3621: case 3622: case 3623: case 3624: case 3625: case 3626: case 3627: case 3628: case 3629: case 3630: case 3631: 
            case 3632: case 3633: case 3634: case 3635: case 3636: case 3637: case 3638: case 3639: case 3640: case 3641: case 3642: case 3643: case 3644: case 3645: case 3646: case 3647: 
            case 3648: case 3649: case 3650: case 3651: case 3652: case 3653: case 3654: case 3655: case 3656: case 3657: case 3658: case 3659: case 3660: case 3661: case 3662: case 3663: 
            case 3664: case 3665: case 3666: case 3667: case 3668: case 3669: case 3670: case 3671: case 3672: case 3673: case 3674: case 3675: case 3676: case 3677: case 3678: case 3679: 
            case 3680: case 3681: case 3682: case 3683: case 3684: case 3685: case 3686: case 3687: case 3688: case 3689: case 3690: case 3691: case 3692: case 3693: case 3694: case 3695: 
            case 3696: case 3697: case 3698: case 3699: case 3700: case 3701: case 3702: case 3703: case 3704: case 3705: case 3706: case 3707: case 3708: case 3709: case 3710: case 3711: 
            case 3712: case 3713: case 3714: case 3715: case 3716: case 3717: case 3718: case 3719: case 3720: case 3721: case 3722: case 3723: case 3724: case 3725: case 3726: case 3727: 
            case 3728: case 3729: case 3730: case 3731: case 3732: case 3733: case 3734: case 3735: case 3736: case 3737: case 3738: case 3739: case 3740: case 3741: case 3742: case 3743: 
            case 3744: case 3745: case 3746: case 3747: case 3748: case 3749: case 3750: case 3751: case 3752: case 3753: case 3754: case 3755: case 3756: case 3757: case 3758: case 3759: 
            case 3760: case 3761: case 3762: case 3763: case 3764: case 3765: case 3766: case 3767: case 3768: case 3769: case 3770: case 3771: case 3772: case 3773: case 3774: case 3775: 
            case 3776: case 3777: case 3778: case 3779: case 3780: case 3781: case 3782: case 3783: case 3784: case 3785: case 3786: case 3787: case 3788: case 3789: case 3790: case 3791: 
            case 3792: case 3793: case 3794: case 3795: case 3796: case 3797: case 3798: case 3799: case 3800: case 3801: case 3802: case 3803: case 3804: case 3805: case 3806: case 3807: 
            case 3808: case 3809: case 3810: case 3811: case 3812: case 3813: case 3814: case 3815: case 3816: case 3817: case 3818: case 3819: case 3820: case 3821: case 3822: case 3823: 
            case 3824: case 3825: case 3826: case 3827: case 3828: case 3829: case 3830: case 3831: case 3832: case 3833: case 3834: case 3835: case 3836: case 3837: case 3838: case 3839: 
            case 3840: case 3841: case 3842: case 3843: case 3844: case 3845: case 3846: case 3847: case 3848: case 3849: case 3850: case 3851: case 3852: case 3853: case 3854: case 3855: 
            case 3856: case 3857: case 3858: case 3859: case 3860: case 3861: case 3862: case 3863: case 3864: case 3865: case 3866: case 3867: case 3868: case 3869: case 3870: case 3871: 
            case 3872: case 3873: case 3874: case 3875: case 3876: case 3877: case 3878: case 3879: case 3880: case 3881: case 3882: case 3883: case 3884: case 3885: case 3886: case 3887: 
            case 3888: case 3889: case 3890: case 3891: case 3892: case 3893: case 3894: case 3895: case 3896: case 3897: case 3898: case 3899: case 3900: case 3901: case 3902: case 3903: 
            case 3904: case 3905: case 3906: case 3907: case 3908: case 3909: case 3910: case 3911: case 3912: case 3913: case 3914: case 3915: case 3916: case 3917: case 3918: case 3919: 
            case 3920: case 3921: case 3922: case 3923: case 3924: case 3925: case 3926: case 3927: case 3928: case 3929: case 3930: case 3931: case 3932: case 3933: case 3934: case 3935: 
            case 3936: case 3937: case 3938: case 3939: case 3940: case 3941: case 3942: case 3943: case 3944: case 3945: case 3946: case 3947: case 3948: case 3949: case 3950: case 3951: 
            case 3952: case 3953: case 3954: case 3955: case 3956: case 3957: case 3958: case 3959: case 3960: case 3961: case 3962: case 3963: case 3964: case 3965: case 3966: case 3967: 
            case 3968: case 3969: case 3970: case 3971: case 3972: case 3973: case 3974: case 3975: case 3976: case 3977: case 3978: case 3979: case 3980: case 3981: case 3982: case 3983: 
            case 3984: case 3985: case 3986: case 3987: case 3988: case 3989: case 3990: case 3991: case 3992: case 3993: case 3994: case 3995: case 3996: case 3997: case 3998: case 3999: 
            case 4000: case 4001: case 4002: case 4003: case 4004: case 4005: case 4006: case 4007: case 4008: case 4009: case 4010: case 4011: case 4012: case 4013: case 4014: case 4015: 
            case 4016: case 4017: case 4018: case 4019: case 4020: case 4021: case 4022: case 4023: case 4024: case 4025: case 4026: case 4027: case 4028: case 4029: case 4030: case 4031: 
            case 4032: case 4033: case 4034: case 4035: case 4036: case 4037: case 4038: case 4039: case 4040: case 4041: case 4042: case 4043: case 4044: case 4045: case 4046: case 4047: 
            case 4048: case 4049: case 4050: case 4051: case 4052: case 4053: case 4054: case 4055: case 4056: case 4057: case 4058: case 4059: case 4060: case 4061: case 4062: case 4063: 
            case 4064: case 4065: case 4066: case 4067: case 4068: case 4069: case 4070: case 4071: case 4072: case 4073: case 4074: case 4075: case 4076: case 4077: case 4078: case 4079: 
            case 4080: case 4081: case 4082: case 4083: case 4084: case 4085: case 4086: case 4087: case 4088: case 4089: case 4090: case 4091: case 4092: case 4093: case 4094: case 4095: 
            case 4096: 
                return ImmutableTabledArray4096Float.getInstance(checked, values);

            case 4097: case 4098: case 4099: case 4100: case 4101: case 4102: case 4103: case 4104: case 4105: case 4106: case 4107: case 4108: case 4109: case 4110: case 4111: 
            case 4112: case 4113: case 4114: case 4115: case 4116: case 4117: case 4118: case 4119: case 4120: case 4121: case 4122: case 4123: case 4124: case 4125: case 4126: case 4127: 
            case 4128: case 4129: case 4130: case 4131: case 4132: case 4133: case 4134: case 4135: case 4136: case 4137: case 4138: case 4139: case 4140: case 4141: case 4142: case 4143: 
            case 4144: case 4145: case 4146: case 4147: case 4148: case 4149: case 4150: case 4151: case 4152: case 4153: case 4154: case 4155: case 4156: case 4157: case 4158: case 4159: 
            case 4160: case 4161: case 4162: case 4163: case 4164: case 4165: case 4166: case 4167: case 4168: case 4169: case 4170: case 4171: case 4172: case 4173: case 4174: case 4175: 
            case 4176: case 4177: case 4178: case 4179: case 4180: case 4181: case 4182: case 4183: case 4184: case 4185: case 4186: case 4187: case 4188: case 4189: case 4190: case 4191: 
            case 4192: case 4193: case 4194: case 4195: case 4196: case 4197: case 4198: case 4199: case 4200: case 4201: case 4202: case 4203: case 4204: case 4205: case 4206: case 4207: 
            case 4208: case 4209: case 4210: case 4211: case 4212: case 4213: case 4214: case 4215: case 4216: case 4217: case 4218: case 4219: case 4220: case 4221: case 4222: case 4223: 
            case 4224: case 4225: case 4226: case 4227: case 4228: case 4229: case 4230: case 4231: case 4232: case 4233: case 4234: case 4235: case 4236: case 4237: case 4238: case 4239: 
            case 4240: case 4241: case 4242: case 4243: case 4244: case 4245: case 4246: case 4247: case 4248: case 4249: case 4250: case 4251: case 4252: case 4253: case 4254: case 4255: 
            case 4256: case 4257: case 4258: case 4259: case 4260: case 4261: case 4262: case 4263: case 4264: case 4265: case 4266: case 4267: case 4268: case 4269: case 4270: case 4271: 
            case 4272: case 4273: case 4274: case 4275: case 4276: case 4277: case 4278: case 4279: case 4280: case 4281: case 4282: case 4283: case 4284: case 4285: case 4286: case 4287: 
            case 4288: case 4289: case 4290: case 4291: case 4292: case 4293: case 4294: case 4295: case 4296: case 4297: case 4298: case 4299: case 4300: case 4301: case 4302: case 4303: 
            case 4304: case 4305: case 4306: case 4307: case 4308: case 4309: case 4310: case 4311: case 4312: case 4313: case 4314: case 4315: case 4316: case 4317: case 4318: case 4319: 
            case 4320: case 4321: case 4322: case 4323: case 4324: case 4325: case 4326: case 4327: case 4328: case 4329: case 4330: case 4331: case 4332: case 4333: case 4334: case 4335: 
            case 4336: case 4337: case 4338: case 4339: case 4340: case 4341: case 4342: case 4343: case 4344: case 4345: case 4346: case 4347: case 4348: case 4349: case 4350: case 4351: 
            case 4352: case 4353: case 4354: case 4355: case 4356: case 4357: case 4358: case 4359: case 4360: case 4361: case 4362: case 4363: case 4364: case 4365: case 4366: case 4367: 
            case 4368: case 4369: case 4370: case 4371: case 4372: case 4373: case 4374: case 4375: case 4376: case 4377: case 4378: case 4379: case 4380: case 4381: case 4382: case 4383: 
            case 4384: case 4385: case 4386: case 4387: case 4388: case 4389: case 4390: case 4391: case 4392: case 4393: case 4394: case 4395: case 4396: case 4397: case 4398: case 4399: 
            case 4400: case 4401: case 4402: case 4403: case 4404: case 4405: case 4406: case 4407: case 4408: case 4409: case 4410: case 4411: case 4412: case 4413: case 4414: case 4415: 
            case 4416: case 4417: case 4418: case 4419: case 4420: case 4421: case 4422: case 4423: case 4424: case 4425: case 4426: case 4427: case 4428: case 4429: case 4430: case 4431: 
            case 4432: case 4433: case 4434: case 4435: case 4436: case 4437: case 4438: case 4439: case 4440: case 4441: case 4442: case 4443: case 4444: case 4445: case 4446: case 4447: 
            case 4448: case 4449: case 4450: case 4451: case 4452: case 4453: case 4454: case 4455: case 4456: case 4457: case 4458: case 4459: case 4460: case 4461: case 4462: case 4463: 
            case 4464: case 4465: case 4466: case 4467: case 4468: case 4469: case 4470: case 4471: case 4472: case 4473: case 4474: case 4475: case 4476: case 4477: case 4478: case 4479: 
            case 4480: case 4481: case 4482: case 4483: case 4484: case 4485: case 4486: case 4487: case 4488: case 4489: case 4490: case 4491: case 4492: case 4493: case 4494: case 4495: 
            case 4496: case 4497: case 4498: case 4499: case 4500: case 4501: case 4502: case 4503: case 4504: case 4505: case 4506: case 4507: case 4508: case 4509: case 4510: case 4511: 
            case 4512: case 4513: case 4514: case 4515: case 4516: case 4517: case 4518: case 4519: case 4520: case 4521: case 4522: case 4523: case 4524: case 4525: case 4526: case 4527: 
            case 4528: case 4529: case 4530: case 4531: case 4532: case 4533: case 4534: case 4535: case 4536: case 4537: case 4538: case 4539: case 4540: case 4541: case 4542: case 4543: 
            case 4544: case 4545: case 4546: case 4547: case 4548: case 4549: case 4550: case 4551: case 4552: case 4553: case 4554: case 4555: case 4556: case 4557: case 4558: case 4559: 
            case 4560: case 4561: case 4562: case 4563: case 4564: case 4565: case 4566: case 4567: case 4568: case 4569: case 4570: case 4571: case 4572: case 4573: case 4574: case 4575: 
            case 4576: case 4577: case 4578: case 4579: case 4580: case 4581: case 4582: case 4583: case 4584: case 4585: case 4586: case 4587: case 4588: case 4589: case 4590: case 4591: 
            case 4592: case 4593: case 4594: case 4595: case 4596: case 4597: case 4598: case 4599: case 4600: case 4601: case 4602: case 4603: case 4604: case 4605: case 4606: case 4607: 
            case 4608: case 4609: case 4610: case 4611: case 4612: case 4613: case 4614: case 4615: case 4616: case 4617: case 4618: case 4619: case 4620: case 4621: case 4622: case 4623: 
            case 4624: case 4625: case 4626: case 4627: case 4628: case 4629: case 4630: case 4631: case 4632: case 4633: case 4634: case 4635: case 4636: case 4637: case 4638: case 4639: 
            case 4640: case 4641: case 4642: case 4643: case 4644: case 4645: case 4646: case 4647: case 4648: case 4649: case 4650: case 4651: case 4652: case 4653: case 4654: case 4655: 
            case 4656: case 4657: case 4658: case 4659: case 4660: case 4661: case 4662: case 4663: case 4664: case 4665: case 4666: case 4667: case 4668: case 4669: case 4670: case 4671: 
            case 4672: case 4673: case 4674: case 4675: case 4676: case 4677: case 4678: case 4679: case 4680: case 4681: case 4682: case 4683: case 4684: case 4685: case 4686: case 4687: 
            case 4688: case 4689: case 4690: case 4691: case 4692: case 4693: case 4694: case 4695: case 4696: case 4697: case 4698: case 4699: case 4700: case 4701: case 4702: case 4703: 
            case 4704: case 4705: case 4706: case 4707: case 4708: case 4709: case 4710: case 4711: case 4712: case 4713: case 4714: case 4715: case 4716: case 4717: case 4718: case 4719: 
            case 4720: case 4721: case 4722: case 4723: case 4724: case 4725: case 4726: case 4727: case 4728: case 4729: case 4730: case 4731: case 4732: case 4733: case 4734: case 4735: 
            case 4736: case 4737: case 4738: case 4739: case 4740: case 4741: case 4742: case 4743: case 4744: case 4745: case 4746: case 4747: case 4748: case 4749: case 4750: case 4751: 
            case 4752: case 4753: case 4754: case 4755: case 4756: case 4757: case 4758: case 4759: case 4760: case 4761: case 4762: case 4763: case 4764: case 4765: case 4766: case 4767: 
            case 4768: case 4769: case 4770: case 4771: case 4772: case 4773: case 4774: case 4775: case 4776: case 4777: case 4778: case 4779: case 4780: case 4781: case 4782: case 4783: 
            case 4784: case 4785: case 4786: case 4787: case 4788: case 4789: case 4790: case 4791: case 4792: case 4793: case 4794: case 4795: case 4796: case 4797: case 4798: case 4799: 
            case 4800: case 4801: case 4802: case 4803: case 4804: case 4805: case 4806: case 4807: case 4808: case 4809: case 4810: case 4811: case 4812: case 4813: case 4814: case 4815: 
            case 4816: case 4817: case 4818: case 4819: case 4820: case 4821: case 4822: case 4823: case 4824: case 4825: case 4826: case 4827: case 4828: case 4829: case 4830: case 4831: 
            case 4832: case 4833: case 4834: case 4835: case 4836: case 4837: case 4838: case 4839: case 4840: case 4841: case 4842: case 4843: case 4844: case 4845: case 4846: case 4847: 
            case 4848: case 4849: case 4850: case 4851: case 4852: case 4853: case 4854: case 4855: case 4856: case 4857: case 4858: case 4859: case 4860: case 4861: case 4862: case 4863: 
            case 4864: case 4865: case 4866: case 4867: case 4868: case 4869: case 4870: case 4871: case 4872: case 4873: case 4874: case 4875: case 4876: case 4877: case 4878: case 4879: 
            case 4880: case 4881: case 4882: case 4883: case 4884: case 4885: case 4886: case 4887: case 4888: case 4889: case 4890: case 4891: case 4892: case 4893: case 4894: case 4895: 
            case 4896: case 4897: case 4898: case 4899: case 4900: case 4901: case 4902: case 4903: case 4904: case 4905: case 4906: case 4907: case 4908: case 4909: case 4910: case 4911: 
            case 4912: case 4913: case 4914: case 4915: case 4916: case 4917: case 4918: case 4919: case 4920: case 4921: case 4922: case 4923: case 4924: case 4925: case 4926: case 4927: 
            case 4928: case 4929: case 4930: case 4931: case 4932: case 4933: case 4934: case 4935: case 4936: case 4937: case 4938: case 4939: case 4940: case 4941: case 4942: case 4943: 
            case 4944: case 4945: case 4946: case 4947: case 4948: case 4949: case 4950: case 4951: case 4952: case 4953: case 4954: case 4955: case 4956: case 4957: case 4958: case 4959: 
            case 4960: case 4961: case 4962: case 4963: case 4964: case 4965: case 4966: case 4967: case 4968: case 4969: case 4970: case 4971: case 4972: case 4973: case 4974: case 4975: 
            case 4976: case 4977: case 4978: case 4979: case 4980: case 4981: case 4982: case 4983: case 4984: case 4985: case 4986: case 4987: case 4988: case 4989: case 4990: case 4991: 
            case 4992: case 4993: case 4994: case 4995: case 4996: case 4997: case 4998: case 4999: case 5000: case 5001: case 5002: case 5003: case 5004: case 5005: case 5006: case 5007: 
            case 5008: case 5009: case 5010: case 5011: case 5012: case 5013: case 5014: case 5015: case 5016: case 5017: case 5018: case 5019: case 5020: case 5021: case 5022: case 5023: 
            case 5024: case 5025: case 5026: case 5027: case 5028: case 5029: case 5030: case 5031: case 5032: case 5033: case 5034: case 5035: case 5036: case 5037: case 5038: case 5039: 
            case 5040: case 5041: case 5042: case 5043: case 5044: case 5045: case 5046: case 5047: case 5048: case 5049: case 5050: case 5051: case 5052: case 5053: case 5054: case 5055: 
            case 5056: case 5057: case 5058: case 5059: case 5060: case 5061: case 5062: case 5063: case 5064: case 5065: case 5066: case 5067: case 5068: case 5069: case 5070: case 5071: 
            case 5072: case 5073: case 5074: case 5075: case 5076: case 5077: case 5078: case 5079: case 5080: case 5081: case 5082: case 5083: case 5084: case 5085: case 5086: case 5087: 
            case 5088: case 5089: case 5090: case 5091: case 5092: case 5093: case 5094: case 5095: case 5096: case 5097: case 5098: case 5099: case 5100: case 5101: case 5102: case 5103: 
            case 5104: case 5105: case 5106: case 5107: case 5108: case 5109: case 5110: case 5111: case 5112: case 5113: case 5114: case 5115: case 5116: case 5117: case 5118: case 5119: 
            case 5120: case 5121: case 5122: case 5123: case 5124: case 5125: case 5126: case 5127: case 5128: case 5129: case 5130: case 5131: case 5132: case 5133: case 5134: case 5135: 
            case 5136: case 5137: case 5138: case 5139: case 5140: case 5141: case 5142: case 5143: case 5144: case 5145: case 5146: case 5147: case 5148: case 5149: case 5150: case 5151: 
            case 5152: case 5153: case 5154: case 5155: case 5156: case 5157: case 5158: case 5159: case 5160: case 5161: case 5162: case 5163: case 5164: case 5165: case 5166: case 5167: 
            case 5168: case 5169: case 5170: case 5171: case 5172: case 5173: case 5174: case 5175: case 5176: case 5177: case 5178: case 5179: case 5180: case 5181: case 5182: case 5183: 
            case 5184: case 5185: case 5186: case 5187: case 5188: case 5189: case 5190: case 5191: case 5192: case 5193: case 5194: case 5195: case 5196: case 5197: case 5198: case 5199: 
            case 5200: case 5201: case 5202: case 5203: case 5204: case 5205: case 5206: case 5207: case 5208: case 5209: case 5210: case 5211: case 5212: case 5213: case 5214: case 5215: 
            case 5216: case 5217: case 5218: case 5219: case 5220: case 5221: case 5222: case 5223: case 5224: case 5225: case 5226: case 5227: case 5228: case 5229: case 5230: case 5231: 
            case 5232: case 5233: case 5234: case 5235: case 5236: case 5237: case 5238: case 5239: case 5240: case 5241: case 5242: case 5243: case 5244: case 5245: case 5246: case 5247: 
            case 5248: case 5249: case 5250: case 5251: case 5252: case 5253: case 5254: case 5255: case 5256: case 5257: case 5258: case 5259: case 5260: case 5261: case 5262: case 5263: 
            case 5264: case 5265: case 5266: case 5267: case 5268: case 5269: case 5270: case 5271: case 5272: case 5273: case 5274: case 5275: case 5276: case 5277: case 5278: case 5279: 
            case 5280: case 5281: case 5282: case 5283: case 5284: case 5285: case 5286: case 5287: case 5288: case 5289: case 5290: case 5291: case 5292: case 5293: case 5294: case 5295: 
            case 5296: case 5297: case 5298: case 5299: case 5300: case 5301: case 5302: case 5303: case 5304: case 5305: case 5306: case 5307: case 5308: case 5309: case 5310: case 5311: 
            case 5312: case 5313: case 5314: case 5315: case 5316: case 5317: case 5318: case 5319: case 5320: case 5321: case 5322: case 5323: case 5324: case 5325: case 5326: case 5327: 
            case 5328: case 5329: case 5330: case 5331: case 5332: case 5333: case 5334: case 5335: case 5336: case 5337: case 5338: case 5339: case 5340: case 5341: case 5342: case 5343: 
            case 5344: case 5345: case 5346: case 5347: case 5348: case 5349: case 5350: case 5351: case 5352: case 5353: case 5354: case 5355: case 5356: case 5357: case 5358: case 5359: 
            case 5360: case 5361: case 5362: case 5363: case 5364: case 5365: case 5366: case 5367: case 5368: case 5369: case 5370: case 5371: case 5372: case 5373: case 5374: case 5375: 
            case 5376: case 5377: case 5378: case 5379: case 5380: case 5381: case 5382: case 5383: case 5384: case 5385: case 5386: case 5387: case 5388: case 5389: case 5390: case 5391: 
            case 5392: case 5393: case 5394: case 5395: case 5396: case 5397: case 5398: case 5399: case 5400: case 5401: case 5402: case 5403: case 5404: case 5405: case 5406: case 5407: 
            case 5408: case 5409: case 5410: case 5411: case 5412: case 5413: case 5414: case 5415: case 5416: case 5417: case 5418: case 5419: case 5420: case 5421: case 5422: case 5423: 
            case 5424: case 5425: case 5426: case 5427: case 5428: case 5429: case 5430: case 5431: case 5432: case 5433: case 5434: case 5435: case 5436: case 5437: case 5438: case 5439: 
            case 5440: case 5441: case 5442: case 5443: case 5444: case 5445: case 5446: case 5447: case 5448: case 5449: case 5450: case 5451: case 5452: case 5453: case 5454: case 5455: 
            case 5456: case 5457: case 5458: case 5459: case 5460: case 5461: case 5462: case 5463: case 5464: case 5465: case 5466: case 5467: case 5468: case 5469: case 5470: case 5471: 
            case 5472: case 5473: case 5474: case 5475: case 5476: case 5477: case 5478: case 5479: case 5480: case 5481: case 5482: case 5483: case 5484: case 5485: case 5486: case 5487: 
            case 5488: case 5489: case 5490: case 5491: case 5492: case 5493: case 5494: case 5495: case 5496: case 5497: case 5498: case 5499: case 5500: case 5501: case 5502: case 5503: 
            case 5504: case 5505: case 5506: case 5507: case 5508: case 5509: case 5510: case 5511: case 5512: case 5513: case 5514: case 5515: case 5516: case 5517: case 5518: case 5519: 
            case 5520: case 5521: case 5522: case 5523: case 5524: case 5525: case 5526: case 5527: case 5528: case 5529: case 5530: case 5531: case 5532: case 5533: case 5534: case 5535: 
            case 5536: case 5537: case 5538: case 5539: case 5540: case 5541: case 5542: case 5543: case 5544: case 5545: case 5546: case 5547: case 5548: case 5549: case 5550: case 5551: 
            case 5552: case 5553: case 5554: case 5555: case 5556: case 5557: case 5558: case 5559: case 5560: case 5561: case 5562: case 5563: case 5564: case 5565: case 5566: case 5567: 
            case 5568: case 5569: case 5570: case 5571: case 5572: case 5573: case 5574: case 5575: case 5576: case 5577: case 5578: case 5579: case 5580: case 5581: case 5582: case 5583: 
            case 5584: case 5585: case 5586: case 5587: case 5588: case 5589: case 5590: case 5591: case 5592: case 5593: case 5594: case 5595: case 5596: case 5597: case 5598: case 5599: 
            case 5600: case 5601: case 5602: case 5603: case 5604: case 5605: case 5606: case 5607: case 5608: case 5609: case 5610: case 5611: case 5612: case 5613: case 5614: case 5615: 
            case 5616: case 5617: case 5618: case 5619: case 5620: case 5621: case 5622: case 5623: case 5624: case 5625: case 5626: case 5627: case 5628: case 5629: case 5630: case 5631: 
            case 5632: case 5633: case 5634: case 5635: case 5636: case 5637: case 5638: case 5639: case 5640: case 5641: case 5642: case 5643: case 5644: case 5645: case 5646: case 5647: 
            case 5648: case 5649: case 5650: case 5651: case 5652: case 5653: case 5654: case 5655: case 5656: case 5657: case 5658: case 5659: case 5660: case 5661: case 5662: case 5663: 
            case 5664: case 5665: case 5666: case 5667: case 5668: case 5669: case 5670: case 5671: case 5672: case 5673: case 5674: case 5675: case 5676: case 5677: case 5678: case 5679: 
            case 5680: case 5681: case 5682: case 5683: case 5684: case 5685: case 5686: case 5687: case 5688: case 5689: case 5690: case 5691: case 5692: case 5693: case 5694: case 5695: 
            case 5696: case 5697: case 5698: case 5699: case 5700: case 5701: case 5702: case 5703: case 5704: case 5705: case 5706: case 5707: case 5708: case 5709: case 5710: case 5711: 
            case 5712: case 5713: case 5714: case 5715: case 5716: case 5717: case 5718: case 5719: case 5720: case 5721: case 5722: case 5723: case 5724: case 5725: case 5726: case 5727: 
            case 5728: case 5729: case 5730: case 5731: case 5732: case 5733: case 5734: case 5735: case 5736: case 5737: case 5738: case 5739: case 5740: case 5741: case 5742: case 5743: 
            case 5744: case 5745: case 5746: case 5747: case 5748: case 5749: case 5750: case 5751: case 5752: case 5753: case 5754: case 5755: case 5756: case 5757: case 5758: case 5759: 
            case 5760: case 5761: case 5762: case 5763: case 5764: case 5765: case 5766: case 5767: case 5768: case 5769: case 5770: case 5771: case 5772: case 5773: case 5774: case 5775: 
            case 5776: case 5777: case 5778: case 5779: case 5780: case 5781: case 5782: case 5783: case 5784: case 5785: case 5786: case 5787: case 5788: case 5789: case 5790: case 5791: 
            case 5792: case 5793: case 5794: case 5795: case 5796: case 5797: case 5798: case 5799: case 5800: case 5801: case 5802: case 5803: case 5804: case 5805: case 5806: case 5807: 
            case 5808: case 5809: case 5810: case 5811: case 5812: case 5813: case 5814: case 5815: case 5816: case 5817: case 5818: case 5819: case 5820: case 5821: case 5822: case 5823: 
            case 5824: case 5825: case 5826: case 5827: case 5828: case 5829: case 5830: case 5831: case 5832: case 5833: case 5834: case 5835: case 5836: case 5837: case 5838: case 5839: 
            case 5840: case 5841: case 5842: case 5843: case 5844: case 5845: case 5846: case 5847: case 5848: case 5849: case 5850: case 5851: case 5852: case 5853: case 5854: case 5855: 
            case 5856: case 5857: case 5858: case 5859: case 5860: case 5861: case 5862: case 5863: case 5864: case 5865: case 5866: case 5867: case 5868: case 5869: case 5870: case 5871: 
            case 5872: case 5873: case 5874: case 5875: case 5876: case 5877: case 5878: case 5879: case 5880: case 5881: case 5882: case 5883: case 5884: case 5885: case 5886: case 5887: 
            case 5888: case 5889: case 5890: case 5891: case 5892: case 5893: case 5894: case 5895: case 5896: case 5897: case 5898: case 5899: case 5900: case 5901: case 5902: case 5903: 
            case 5904: case 5905: case 5906: case 5907: case 5908: case 5909: case 5910: case 5911: case 5912: case 5913: case 5914: case 5915: case 5916: case 5917: case 5918: case 5919: 
            case 5920: case 5921: case 5922: case 5923: case 5924: case 5925: case 5926: case 5927: case 5928: case 5929: case 5930: case 5931: case 5932: case 5933: case 5934: case 5935: 
            case 5936: case 5937: case 5938: case 5939: case 5940: case 5941: case 5942: case 5943: case 5944: case 5945: case 5946: case 5947: case 5948: case 5949: case 5950: case 5951: 
            case 5952: case 5953: case 5954: case 5955: case 5956: case 5957: case 5958: case 5959: case 5960: case 5961: case 5962: case 5963: case 5964: case 5965: case 5966: case 5967: 
            case 5968: case 5969: case 5970: case 5971: case 5972: case 5973: case 5974: case 5975: case 5976: case 5977: case 5978: case 5979: case 5980: case 5981: case 5982: case 5983: 
            case 5984: case 5985: case 5986: case 5987: case 5988: case 5989: case 5990: case 5991: case 5992: case 5993: case 5994: case 5995: case 5996: case 5997: case 5998: case 5999: 
            case 6000: case 6001: case 6002: case 6003: case 6004: case 6005: case 6006: case 6007: case 6008: case 6009: case 6010: case 6011: case 6012: case 6013: case 6014: case 6015: 
            case 6016: case 6017: case 6018: case 6019: case 6020: case 6021: case 6022: case 6023: case 6024: case 6025: case 6026: case 6027: case 6028: case 6029: case 6030: case 6031: 
            case 6032: case 6033: case 6034: case 6035: case 6036: case 6037: case 6038: case 6039: case 6040: case 6041: case 6042: case 6043: case 6044: case 6045: case 6046: case 6047: 
            case 6048: case 6049: case 6050: case 6051: case 6052: case 6053: case 6054: case 6055: case 6056: case 6057: case 6058: case 6059: case 6060: case 6061: case 6062: case 6063: 
            case 6064: case 6065: case 6066: case 6067: case 6068: case 6069: case 6070: case 6071: case 6072: case 6073: case 6074: case 6075: case 6076: case 6077: case 6078: case 6079: 
            case 6080: case 6081: case 6082: case 6083: case 6084: case 6085: case 6086: case 6087: case 6088: case 6089: case 6090: case 6091: case 6092: case 6093: case 6094: case 6095: 
            case 6096: case 6097: case 6098: case 6099: case 6100: case 6101: case 6102: case 6103: case 6104: case 6105: case 6106: case 6107: case 6108: case 6109: case 6110: case 6111: 
            case 6112: case 6113: case 6114: case 6115: case 6116: case 6117: case 6118: case 6119: case 6120: case 6121: case 6122: case 6123: case 6124: case 6125: case 6126: case 6127: 
            case 6128: case 6129: case 6130: case 6131: case 6132: case 6133: case 6134: case 6135: case 6136: case 6137: case 6138: case 6139: case 6140: case 6141: case 6142: case 6143: 
            case 6144: case 6145: case 6146: case 6147: case 6148: case 6149: case 6150: case 6151: case 6152: case 6153: case 6154: case 6155: case 6156: case 6157: case 6158: case 6159: 
            case 6160: case 6161: case 6162: case 6163: case 6164: case 6165: case 6166: case 6167: case 6168: case 6169: case 6170: case 6171: case 6172: case 6173: case 6174: case 6175: 
            case 6176: case 6177: case 6178: case 6179: case 6180: case 6181: case 6182: case 6183: case 6184: case 6185: case 6186: case 6187: case 6188: case 6189: case 6190: case 6191: 
            case 6192: case 6193: case 6194: case 6195: case 6196: case 6197: case 6198: case 6199: case 6200: case 6201: case 6202: case 6203: case 6204: case 6205: case 6206: case 6207: 
            case 6208: case 6209: case 6210: case 6211: case 6212: case 6213: case 6214: case 6215: case 6216: case 6217: case 6218: case 6219: case 6220: case 6221: case 6222: case 6223: 
            case 6224: case 6225: case 6226: case 6227: case 6228: case 6229: case 6230: case 6231: case 6232: case 6233: case 6234: case 6235: case 6236: case 6237: case 6238: case 6239: 
            case 6240: case 6241: case 6242: case 6243: case 6244: case 6245: case 6246: case 6247: case 6248: case 6249: case 6250: case 6251: case 6252: case 6253: case 6254: case 6255: 
            case 6256: case 6257: case 6258: case 6259: case 6260: case 6261: case 6262: case 6263: case 6264: case 6265: case 6266: case 6267: case 6268: case 6269: case 6270: case 6271: 
            case 6272: case 6273: case 6274: case 6275: case 6276: case 6277: case 6278: case 6279: case 6280: case 6281: case 6282: case 6283: case 6284: case 6285: case 6286: case 6287: 
            case 6288: case 6289: case 6290: case 6291: case 6292: case 6293: case 6294: case 6295: case 6296: case 6297: case 6298: case 6299: case 6300: case 6301: case 6302: case 6303: 
            case 6304: case 6305: case 6306: case 6307: case 6308: case 6309: case 6310: case 6311: case 6312: case 6313: case 6314: case 6315: case 6316: case 6317: case 6318: case 6319: 
            case 6320: case 6321: case 6322: case 6323: case 6324: case 6325: case 6326: case 6327: case 6328: case 6329: case 6330: case 6331: case 6332: case 6333: case 6334: case 6335: 
            case 6336: case 6337: case 6338: case 6339: case 6340: case 6341: case 6342: case 6343: case 6344: case 6345: case 6346: case 6347: case 6348: case 6349: case 6350: case 6351: 
            case 6352: case 6353: case 6354: case 6355: case 6356: case 6357: case 6358: case 6359: case 6360: case 6361: case 6362: case 6363: case 6364: case 6365: case 6366: case 6367: 
            case 6368: case 6369: case 6370: case 6371: case 6372: case 6373: case 6374: case 6375: case 6376: case 6377: case 6378: case 6379: case 6380: case 6381: case 6382: case 6383: 
            case 6384: case 6385: case 6386: case 6387: case 6388: case 6389: case 6390: case 6391: case 6392: case 6393: case 6394: case 6395: case 6396: case 6397: case 6398: case 6399: 
            case 6400: case 6401: case 6402: case 6403: case 6404: case 6405: case 6406: case 6407: case 6408: case 6409: case 6410: case 6411: case 6412: case 6413: case 6414: case 6415: 
            case 6416: case 6417: case 6418: case 6419: case 6420: case 6421: case 6422: case 6423: case 6424: case 6425: case 6426: case 6427: case 6428: case 6429: case 6430: case 6431: 
            case 6432: case 6433: case 6434: case 6435: case 6436: case 6437: case 6438: case 6439: case 6440: case 6441: case 6442: case 6443: case 6444: case 6445: case 6446: case 6447: 
            case 6448: case 6449: case 6450: case 6451: case 6452: case 6453: case 6454: case 6455: case 6456: case 6457: case 6458: case 6459: case 6460: case 6461: case 6462: case 6463: 
            case 6464: case 6465: case 6466: case 6467: case 6468: case 6469: case 6470: case 6471: case 6472: case 6473: case 6474: case 6475: case 6476: case 6477: case 6478: case 6479: 
            case 6480: case 6481: case 6482: case 6483: case 6484: case 6485: case 6486: case 6487: case 6488: case 6489: case 6490: case 6491: case 6492: case 6493: case 6494: case 6495: 
            case 6496: case 6497: case 6498: case 6499: case 6500: case 6501: case 6502: case 6503: case 6504: case 6505: case 6506: case 6507: case 6508: case 6509: case 6510: case 6511: 
            case 6512: case 6513: case 6514: case 6515: case 6516: case 6517: case 6518: case 6519: case 6520: case 6521: case 6522: case 6523: case 6524: case 6525: case 6526: case 6527: 
            case 6528: case 6529: case 6530: case 6531: case 6532: case 6533: case 6534: case 6535: case 6536: case 6537: case 6538: case 6539: case 6540: case 6541: case 6542: case 6543: 
            case 6544: case 6545: case 6546: case 6547: case 6548: case 6549: case 6550: case 6551: case 6552: case 6553: case 6554: case 6555: case 6556: case 6557: case 6558: case 6559: 
            case 6560: case 6561: case 6562: case 6563: case 6564: case 6565: case 6566: case 6567: case 6568: case 6569: case 6570: case 6571: case 6572: case 6573: case 6574: case 6575: 
            case 6576: case 6577: case 6578: case 6579: case 6580: case 6581: case 6582: case 6583: case 6584: case 6585: case 6586: case 6587: case 6588: case 6589: case 6590: case 6591: 
            case 6592: case 6593: case 6594: case 6595: case 6596: case 6597: case 6598: case 6599: case 6600: case 6601: case 6602: case 6603: case 6604: case 6605: case 6606: case 6607: 
            case 6608: case 6609: case 6610: case 6611: case 6612: case 6613: case 6614: case 6615: case 6616: case 6617: case 6618: case 6619: case 6620: case 6621: case 6622: case 6623: 
            case 6624: case 6625: case 6626: case 6627: case 6628: case 6629: case 6630: case 6631: case 6632: case 6633: case 6634: case 6635: case 6636: case 6637: case 6638: case 6639: 
            case 6640: case 6641: case 6642: case 6643: case 6644: case 6645: case 6646: case 6647: case 6648: case 6649: case 6650: case 6651: case 6652: case 6653: case 6654: case 6655: 
            case 6656: case 6657: case 6658: case 6659: case 6660: case 6661: case 6662: case 6663: case 6664: case 6665: case 6666: case 6667: case 6668: case 6669: case 6670: case 6671: 
            case 6672: case 6673: case 6674: case 6675: case 6676: case 6677: case 6678: case 6679: case 6680: case 6681: case 6682: case 6683: case 6684: case 6685: case 6686: case 6687: 
            case 6688: case 6689: case 6690: case 6691: case 6692: case 6693: case 6694: case 6695: case 6696: case 6697: case 6698: case 6699: case 6700: case 6701: case 6702: case 6703: 
            case 6704: case 6705: case 6706: case 6707: case 6708: case 6709: case 6710: case 6711: case 6712: case 6713: case 6714: case 6715: case 6716: case 6717: case 6718: case 6719: 
            case 6720: case 6721: case 6722: case 6723: case 6724: case 6725: case 6726: case 6727: case 6728: case 6729: case 6730: case 6731: case 6732: case 6733: case 6734: case 6735: 
            case 6736: case 6737: case 6738: case 6739: case 6740: case 6741: case 6742: case 6743: case 6744: case 6745: case 6746: case 6747: case 6748: case 6749: case 6750: case 6751: 
            case 6752: case 6753: case 6754: case 6755: case 6756: case 6757: case 6758: case 6759: case 6760: case 6761: case 6762: case 6763: case 6764: case 6765: case 6766: case 6767: 
            case 6768: case 6769: case 6770: case 6771: case 6772: case 6773: case 6774: case 6775: case 6776: case 6777: case 6778: case 6779: case 6780: case 6781: case 6782: case 6783: 
            case 6784: case 6785: case 6786: case 6787: case 6788: case 6789: case 6790: case 6791: case 6792: case 6793: case 6794: case 6795: case 6796: case 6797: case 6798: case 6799: 
            case 6800: case 6801: case 6802: case 6803: case 6804: case 6805: case 6806: case 6807: case 6808: case 6809: case 6810: case 6811: case 6812: case 6813: case 6814: case 6815: 
            case 6816: case 6817: case 6818: case 6819: case 6820: case 6821: case 6822: case 6823: case 6824: case 6825: case 6826: case 6827: case 6828: case 6829: case 6830: case 6831: 
            case 6832: case 6833: case 6834: case 6835: case 6836: case 6837: case 6838: case 6839: case 6840: case 6841: case 6842: case 6843: case 6844: case 6845: case 6846: case 6847: 
            case 6848: case 6849: case 6850: case 6851: case 6852: case 6853: case 6854: case 6855: case 6856: case 6857: case 6858: case 6859: case 6860: case 6861: case 6862: case 6863: 
            case 6864: case 6865: case 6866: case 6867: case 6868: case 6869: case 6870: case 6871: case 6872: case 6873: case 6874: case 6875: case 6876: case 6877: case 6878: case 6879: 
            case 6880: case 6881: case 6882: case 6883: case 6884: case 6885: case 6886: case 6887: case 6888: case 6889: case 6890: case 6891: case 6892: case 6893: case 6894: case 6895: 
            case 6896: case 6897: case 6898: case 6899: case 6900: case 6901: case 6902: case 6903: case 6904: case 6905: case 6906: case 6907: case 6908: case 6909: case 6910: case 6911: 
            case 6912: case 6913: case 6914: case 6915: case 6916: case 6917: case 6918: case 6919: case 6920: case 6921: case 6922: case 6923: case 6924: case 6925: case 6926: case 6927: 
            case 6928: case 6929: case 6930: case 6931: case 6932: case 6933: case 6934: case 6935: case 6936: case 6937: case 6938: case 6939: case 6940: case 6941: case 6942: case 6943: 
            case 6944: case 6945: case 6946: case 6947: case 6948: case 6949: case 6950: case 6951: case 6952: case 6953: case 6954: case 6955: case 6956: case 6957: case 6958: case 6959: 
            case 6960: case 6961: case 6962: case 6963: case 6964: case 6965: case 6966: case 6967: case 6968: case 6969: case 6970: case 6971: case 6972: case 6973: case 6974: case 6975: 
            case 6976: case 6977: case 6978: case 6979: case 6980: case 6981: case 6982: case 6983: case 6984: case 6985: case 6986: case 6987: case 6988: case 6989: case 6990: case 6991: 
            case 6992: case 6993: case 6994: case 6995: case 6996: case 6997: case 6998: case 6999: case 7000: case 7001: case 7002: case 7003: case 7004: case 7005: case 7006: case 7007: 
            case 7008: case 7009: case 7010: case 7011: case 7012: case 7013: case 7014: case 7015: case 7016: case 7017: case 7018: case 7019: case 7020: case 7021: case 7022: case 7023: 
            case 7024: case 7025: case 7026: case 7027: case 7028: case 7029: case 7030: case 7031: case 7032: case 7033: case 7034: case 7035: case 7036: case 7037: case 7038: case 7039: 
            case 7040: case 7041: case 7042: case 7043: case 7044: case 7045: case 7046: case 7047: case 7048: case 7049: case 7050: case 7051: case 7052: case 7053: case 7054: case 7055: 
            case 7056: case 7057: case 7058: case 7059: case 7060: case 7061: case 7062: case 7063: case 7064: case 7065: case 7066: case 7067: case 7068: case 7069: case 7070: case 7071: 
            case 7072: case 7073: case 7074: case 7075: case 7076: case 7077: case 7078: case 7079: case 7080: case 7081: case 7082: case 7083: case 7084: case 7085: case 7086: case 7087: 
            case 7088: case 7089: case 7090: case 7091: case 7092: case 7093: case 7094: case 7095: case 7096: case 7097: case 7098: case 7099: case 7100: case 7101: case 7102: case 7103: 
            case 7104: case 7105: case 7106: case 7107: case 7108: case 7109: case 7110: case 7111: case 7112: case 7113: case 7114: case 7115: case 7116: case 7117: case 7118: case 7119: 
            case 7120: case 7121: case 7122: case 7123: case 7124: case 7125: case 7126: case 7127: case 7128: case 7129: case 7130: case 7131: case 7132: case 7133: case 7134: case 7135: 
            case 7136: case 7137: case 7138: case 7139: case 7140: case 7141: case 7142: case 7143: case 7144: case 7145: case 7146: case 7147: case 7148: case 7149: case 7150: case 7151: 
            case 7152: case 7153: case 7154: case 7155: case 7156: case 7157: case 7158: case 7159: case 7160: case 7161: case 7162: case 7163: case 7164: case 7165: case 7166: case 7167: 
            case 7168: case 7169: case 7170: case 7171: case 7172: case 7173: case 7174: case 7175: case 7176: case 7177: case 7178: case 7179: case 7180: case 7181: case 7182: case 7183: 
            case 7184: case 7185: case 7186: case 7187: case 7188: case 7189: case 7190: case 7191: case 7192: case 7193: case 7194: case 7195: case 7196: case 7197: case 7198: case 7199: 
            case 7200: case 7201: case 7202: case 7203: case 7204: case 7205: case 7206: case 7207: case 7208: case 7209: case 7210: case 7211: case 7212: case 7213: case 7214: case 7215: 
            case 7216: case 7217: case 7218: case 7219: case 7220: case 7221: case 7222: case 7223: case 7224: case 7225: case 7226: case 7227: case 7228: case 7229: case 7230: case 7231: 
            case 7232: case 7233: case 7234: case 7235: case 7236: case 7237: case 7238: case 7239: case 7240: case 7241: case 7242: case 7243: case 7244: case 7245: case 7246: case 7247: 
            case 7248: case 7249: case 7250: case 7251: case 7252: case 7253: case 7254: case 7255: case 7256: case 7257: case 7258: case 7259: case 7260: case 7261: case 7262: case 7263: 
            case 7264: case 7265: case 7266: case 7267: case 7268: case 7269: case 7270: case 7271: case 7272: case 7273: case 7274: case 7275: case 7276: case 7277: case 7278: case 7279: 
            case 7280: case 7281: case 7282: case 7283: case 7284: case 7285: case 7286: case 7287: case 7288: case 7289: case 7290: case 7291: case 7292: case 7293: case 7294: case 7295: 
            case 7296: case 7297: case 7298: case 7299: case 7300: case 7301: case 7302: case 7303: case 7304: case 7305: case 7306: case 7307: case 7308: case 7309: case 7310: case 7311: 
            case 7312: case 7313: case 7314: case 7315: case 7316: case 7317: case 7318: case 7319: case 7320: case 7321: case 7322: case 7323: case 7324: case 7325: case 7326: case 7327: 
            case 7328: case 7329: case 7330: case 7331: case 7332: case 7333: case 7334: case 7335: case 7336: case 7337: case 7338: case 7339: case 7340: case 7341: case 7342: case 7343: 
            case 7344: case 7345: case 7346: case 7347: case 7348: case 7349: case 7350: case 7351: case 7352: case 7353: case 7354: case 7355: case 7356: case 7357: case 7358: case 7359: 
            case 7360: case 7361: case 7362: case 7363: case 7364: case 7365: case 7366: case 7367: case 7368: case 7369: case 7370: case 7371: case 7372: case 7373: case 7374: case 7375: 
            case 7376: case 7377: case 7378: case 7379: case 7380: case 7381: case 7382: case 7383: case 7384: case 7385: case 7386: case 7387: case 7388: case 7389: case 7390: case 7391: 
            case 7392: case 7393: case 7394: case 7395: case 7396: case 7397: case 7398: case 7399: case 7400: case 7401: case 7402: case 7403: case 7404: case 7405: case 7406: case 7407: 
            case 7408: case 7409: case 7410: case 7411: case 7412: case 7413: case 7414: case 7415: case 7416: case 7417: case 7418: case 7419: case 7420: case 7421: case 7422: case 7423: 
            case 7424: case 7425: case 7426: case 7427: case 7428: case 7429: case 7430: case 7431: case 7432: case 7433: case 7434: case 7435: case 7436: case 7437: case 7438: case 7439: 
            case 7440: case 7441: case 7442: case 7443: case 7444: case 7445: case 7446: case 7447: case 7448: case 7449: case 7450: case 7451: case 7452: case 7453: case 7454: case 7455: 
            case 7456: case 7457: case 7458: case 7459: case 7460: case 7461: case 7462: case 7463: case 7464: case 7465: case 7466: case 7467: case 7468: case 7469: case 7470: case 7471: 
            case 7472: case 7473: case 7474: case 7475: case 7476: case 7477: case 7478: case 7479: case 7480: case 7481: case 7482: case 7483: case 7484: case 7485: case 7486: case 7487: 
            case 7488: case 7489: case 7490: case 7491: case 7492: case 7493: case 7494: case 7495: case 7496: case 7497: case 7498: case 7499: case 7500: case 7501: case 7502: case 7503: 
            case 7504: case 7505: case 7506: case 7507: case 7508: case 7509: case 7510: case 7511: case 7512: case 7513: case 7514: case 7515: case 7516: case 7517: case 7518: case 7519: 
            case 7520: case 7521: case 7522: case 7523: case 7524: case 7525: case 7526: case 7527: case 7528: case 7529: case 7530: case 7531: case 7532: case 7533: case 7534: case 7535: 
            case 7536: case 7537: case 7538: case 7539: case 7540: case 7541: case 7542: case 7543: case 7544: case 7545: case 7546: case 7547: case 7548: case 7549: case 7550: case 7551: 
            case 7552: case 7553: case 7554: case 7555: case 7556: case 7557: case 7558: case 7559: case 7560: case 7561: case 7562: case 7563: case 7564: case 7565: case 7566: case 7567: 
            case 7568: case 7569: case 7570: case 7571: case 7572: case 7573: case 7574: case 7575: case 7576: case 7577: case 7578: case 7579: case 7580: case 7581: case 7582: case 7583: 
            case 7584: case 7585: case 7586: case 7587: case 7588: case 7589: case 7590: case 7591: case 7592: case 7593: case 7594: case 7595: case 7596: case 7597: case 7598: case 7599: 
            case 7600: case 7601: case 7602: case 7603: case 7604: case 7605: case 7606: case 7607: case 7608: case 7609: case 7610: case 7611: case 7612: case 7613: case 7614: case 7615: 
            case 7616: case 7617: case 7618: case 7619: case 7620: case 7621: case 7622: case 7623: case 7624: case 7625: case 7626: case 7627: case 7628: case 7629: case 7630: case 7631: 
            case 7632: case 7633: case 7634: case 7635: case 7636: case 7637: case 7638: case 7639: case 7640: case 7641: case 7642: case 7643: case 7644: case 7645: case 7646: case 7647: 
            case 7648: case 7649: case 7650: case 7651: case 7652: case 7653: case 7654: case 7655: case 7656: case 7657: case 7658: case 7659: case 7660: case 7661: case 7662: case 7663: 
            case 7664: case 7665: case 7666: case 7667: case 7668: case 7669: case 7670: case 7671: case 7672: case 7673: case 7674: case 7675: case 7676: case 7677: case 7678: case 7679: 
            case 7680: case 7681: case 7682: case 7683: case 7684: case 7685: case 7686: case 7687: case 7688: case 7689: case 7690: case 7691: case 7692: case 7693: case 7694: case 7695: 
            case 7696: case 7697: case 7698: case 7699: case 7700: case 7701: case 7702: case 7703: case 7704: case 7705: case 7706: case 7707: case 7708: case 7709: case 7710: case 7711: 
            case 7712: case 7713: case 7714: case 7715: case 7716: case 7717: case 7718: case 7719: case 7720: case 7721: case 7722: case 7723: case 7724: case 7725: case 7726: case 7727: 
            case 7728: case 7729: case 7730: case 7731: case 7732: case 7733: case 7734: case 7735: case 7736: case 7737: case 7738: case 7739: case 7740: case 7741: case 7742: case 7743: 
            case 7744: case 7745: case 7746: case 7747: case 7748: case 7749: case 7750: case 7751: case 7752: case 7753: case 7754: case 7755: case 7756: case 7757: case 7758: case 7759: 
            case 7760: case 7761: case 7762: case 7763: case 7764: case 7765: case 7766: case 7767: case 7768: case 7769: case 7770: case 7771: case 7772: case 7773: case 7774: case 7775: 
            case 7776: case 7777: case 7778: case 7779: case 7780: case 7781: case 7782: case 7783: case 7784: case 7785: case 7786: case 7787: case 7788: case 7789: case 7790: case 7791: 
            case 7792: case 7793: case 7794: case 7795: case 7796: case 7797: case 7798: case 7799: case 7800: case 7801: case 7802: case 7803: case 7804: case 7805: case 7806: case 7807: 
            case 7808: case 7809: case 7810: case 7811: case 7812: case 7813: case 7814: case 7815: case 7816: case 7817: case 7818: case 7819: case 7820: case 7821: case 7822: case 7823: 
            case 7824: case 7825: case 7826: case 7827: case 7828: case 7829: case 7830: case 7831: case 7832: case 7833: case 7834: case 7835: case 7836: case 7837: case 7838: case 7839: 
            case 7840: case 7841: case 7842: case 7843: case 7844: case 7845: case 7846: case 7847: case 7848: case 7849: case 7850: case 7851: case 7852: case 7853: case 7854: case 7855: 
            case 7856: case 7857: case 7858: case 7859: case 7860: case 7861: case 7862: case 7863: case 7864: case 7865: case 7866: case 7867: case 7868: case 7869: case 7870: case 7871: 
            case 7872: case 7873: case 7874: case 7875: case 7876: case 7877: case 7878: case 7879: case 7880: case 7881: case 7882: case 7883: case 7884: case 7885: case 7886: case 7887: 
            case 7888: case 7889: case 7890: case 7891: case 7892: case 7893: case 7894: case 7895: case 7896: case 7897: case 7898: case 7899: case 7900: case 7901: case 7902: case 7903: 
            case 7904: case 7905: case 7906: case 7907: case 7908: case 7909: case 7910: case 7911: case 7912: case 7913: case 7914: case 7915: case 7916: case 7917: case 7918: case 7919: 
            case 7920: case 7921: case 7922: case 7923: case 7924: case 7925: case 7926: case 7927: case 7928: case 7929: case 7930: case 7931: case 7932: case 7933: case 7934: case 7935: 
            case 7936: case 7937: case 7938: case 7939: case 7940: case 7941: case 7942: case 7943: case 7944: case 7945: case 7946: case 7947: case 7948: case 7949: case 7950: case 7951: 
            case 7952: case 7953: case 7954: case 7955: case 7956: case 7957: case 7958: case 7959: case 7960: case 7961: case 7962: case 7963: case 7964: case 7965: case 7966: case 7967: 
            case 7968: case 7969: case 7970: case 7971: case 7972: case 7973: case 7974: case 7975: case 7976: case 7977: case 7978: case 7979: case 7980: case 7981: case 7982: case 7983: 
            case 7984: case 7985: case 7986: case 7987: case 7988: case 7989: case 7990: case 7991: case 7992: case 7993: case 7994: case 7995: case 7996: case 7997: case 7998: case 7999: 
            case 8000: case 8001: case 8002: case 8003: case 8004: case 8005: case 8006: case 8007: case 8008: case 8009: case 8010: case 8011: case 8012: case 8013: case 8014: case 8015: 
            case 8016: case 8017: case 8018: case 8019: case 8020: case 8021: case 8022: case 8023: case 8024: case 8025: case 8026: case 8027: case 8028: case 8029: case 8030: case 8031: 
            case 8032: case 8033: case 8034: case 8035: case 8036: case 8037: case 8038: case 8039: case 8040: case 8041: case 8042: case 8043: case 8044: case 8045: case 8046: case 8047: 
            case 8048: case 8049: case 8050: case 8051: case 8052: case 8053: case 8054: case 8055: case 8056: case 8057: case 8058: case 8059: case 8060: case 8061: case 8062: case 8063: 
            case 8064: case 8065: case 8066: case 8067: case 8068: case 8069: case 8070: case 8071: case 8072: case 8073: case 8074: case 8075: case 8076: case 8077: case 8078: case 8079: 
            case 8080: case 8081: case 8082: case 8083: case 8084: case 8085: case 8086: case 8087: case 8088: case 8089: case 8090: case 8091: case 8092: case 8093: case 8094: case 8095: 
            case 8096: case 8097: case 8098: case 8099: case 8100: case 8101: case 8102: case 8103: case 8104: case 8105: case 8106: case 8107: case 8108: case 8109: case 8110: case 8111: 
            case 8112: case 8113: case 8114: case 8115: case 8116: case 8117: case 8118: case 8119: case 8120: case 8121: case 8122: case 8123: case 8124: case 8125: case 8126: case 8127: 
            case 8128: case 8129: case 8130: case 8131: case 8132: case 8133: case 8134: case 8135: case 8136: case 8137: case 8138: case 8139: case 8140: case 8141: case 8142: case 8143: 
            case 8144: case 8145: case 8146: case 8147: case 8148: case 8149: case 8150: case 8151: case 8152: case 8153: case 8154: case 8155: case 8156: case 8157: case 8158: case 8159: 
            case 8160: case 8161: case 8162: case 8163: case 8164: case 8165: case 8166: case 8167: case 8168: case 8169: case 8170: case 8171: case 8172: case 8173: case 8174: case 8175: 
            case 8176: case 8177: case 8178: case 8179: case 8180: case 8181: case 8182: case 8183: case 8184: case 8185: case 8186: case 8187: case 8188: case 8189: case 8190: case 8191: 
            case 8192: 
                return ImmutableTabledArray8192Float.getInstance(checked, values);


            default:
                return ImmutableTabledArray8192Float.getInstance(checked, values);
        }
    }
}