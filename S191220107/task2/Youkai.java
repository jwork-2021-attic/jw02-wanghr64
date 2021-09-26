package S191220107.task2;

import S191220107.task2.Line.Position;

public enum Youkai implements Linable {
    YK0_0_r0(0, 0, 0), YK0_1_r1(37, 37, 37), YK0_2_r2(52, 52, 52), YK0_3_r3(78, 78, 78), YK0_4_r4(104, 104, 104),
    YK0_5_r5(117, 117, 117), YK0_6_r6(142, 142, 142), YK0_7_r7(164, 164, 164), YK0_8_r8(184, 184, 184),
    YK0_9_r9(197, 197, 197), YK0_10_r10(208, 208, 208), YK0_11_r11(215, 215, 215), YK0_12_r12(225, 225, 225),
    YK0_13_r13(234, 234, 234), YK0_14_r14(244, 244, 244), YK0_15_r15(255, 255, 255), YK1_0_r16(65, 32, 0),
    YK1_1_r17(84, 40, 0), YK1_2_r18(118, 55, 0), YK1_3_r19(154, 80, 0), YK1_4_r20(195, 104, 6), YK1_5_r21(228, 123, 7),
    YK1_6_r22(255, 145, 26), YK1_7_r23(255, 171, 29), YK1_8_r24(255, 197, 31), YK1_9_r25(255, 208, 59),
    YK1_10_r26(255, 216, 76), YK1_11_r27(255, 230, 81), YK1_12_r28(255, 244, 86), YK1_13_r29(255, 249, 112),
    YK1_14_r30(255, 255, 144), YK1_15_r31(255, 255, 170), YK2_0_r32(69, 25, 4), YK2_1_r33(114, 30, 17),
    YK2_2_r34(159, 36, 30), YK2_3_r35(179, 58, 32), YK2_4_r36(200, 81, 32), YK2_5_r37(227, 105, 32),
    YK2_6_r38(252, 129, 32), YK2_7_r39(253, 140, 37), YK2_8_r40(254, 152, 44), YK2_9_r41(255, 174, 56),
    YK2_10_r42(255, 185, 70), YK2_11_r43(255, 191, 81), YK2_12_r44(255, 198, 109), YK2_13_r45(255, 213, 135),
    YK2_14_r46(255, 228, 152), YK2_15_r47(255, 230, 171), YK3_0_r48(93, 31, 12), YK3_1_r49(122, 36, 13),
    YK3_2_r50(152, 44, 14), YK3_3_r51(176, 47, 15), YK3_4_r52(191, 54, 36), YK3_5_r53(211, 78, 42),
    YK3_6_r54(231, 98, 62), YK3_7_r55(243, 110, 74), YK3_8_r56(253, 120, 84), YK3_9_r57(255, 138, 106),
    YK3_10_r58(255, 152, 124), YK3_11_r59(255, 164, 139), YK3_12_r60(255, 179, 158), YK3_13_r61(255, 194, 178),
    YK3_14_r62(255, 208, 195), YK3_15_r63(255, 218, 208), YK4_0_r64(74, 23, 0), YK4_1_r65(114, 31, 0),
    YK4_2_r66(168, 19, 0), YK4_3_r67(200, 33, 10), YK4_4_r68(223, 37, 18), YK4_5_r69(236, 59, 36),
    YK4_6_r70(250, 82, 54), YK4_7_r71(252, 97, 72), YK4_8_r72(255, 112, 95), YK4_9_r73(255, 126, 126),
    YK4_10_r74(255, 143, 143), YK4_11_r75(255, 157, 158), YK4_12_r76(255, 171, 173), YK4_13_r77(255, 185, 189),
    YK4_14_r78(255, 199, 206), YK4_15_r79(255, 202, 222), YK5_0_r80(73, 0, 54), YK5_1_r81(102, 0, 75),
    YK5_2_r82(128, 3, 95), YK5_3_r83(149, 15, 116), YK5_4_r84(170, 34, 136), YK5_5_r85(186, 61, 153),
    YK5_6_r86(202, 77, 169), YK5_7_r87(215, 90, 182), YK5_8_r88(228, 103, 195), YK5_9_r89(239, 114, 206),
    YK5_10_r90(251, 126, 218), YK5_11_r91(255, 141, 225), YK5_12_r92(255, 157, 229), YK5_13_r93(255, 165, 231),
    YK5_14_r94(255, 175, 234), YK5_15_r95(255, 184, 236), YK6_0_r96(72, 3, 108), YK6_1_r97(92, 4, 136),
    YK6_2_r98(101, 13, 144), YK6_3_r99(123, 35, 167), YK6_4_r100(147, 59, 191), YK6_5_r101(157, 69, 201),
    YK6_6_r102(167, 79, 211), YK6_7_r103(178, 90, 222), YK6_8_r104(189, 101, 233), YK6_9_r105(197, 109, 241),
    YK6_10_r106(206, 118, 250), YK6_11_r107(213, 131, 255), YK6_12_r108(218, 144, 255), YK6_13_r109(222, 156, 255),
    YK6_14_r110(226, 169, 255), YK6_15_r111(230, 182, 255), YK7_0_r112(5, 30, 129), YK7_1_r113(6, 38, 165),
    YK7_2_r114(8, 47, 202), YK7_3_r115(38, 61, 212), YK7_4_r116(68, 76, 222), YK7_5_r117(79, 90, 236),
    YK7_6_r118(90, 104, 255), YK7_7_r119(101, 117, 255), YK7_8_r120(113, 131, 255), YK7_9_r121(128, 145, 255),
    YK7_10_r122(144, 160, 255), YK7_11_r123(151, 169, 255), YK7_12_r124(159, 178, 255), YK7_13_r125(175, 190, 255),
    YK7_14_r126(192, 203, 255), YK7_15_r127(205, 211, 255), YK8_0_r128(11, 7, 121), YK8_1_r129(32, 28, 142),
    YK8_2_r130(53, 49, 163), YK8_3_r131(70, 66, 180), YK8_4_r132(87, 83, 197), YK8_5_r133(97, 93, 207),
    YK8_6_r134(109, 105, 219), YK8_7_r135(123, 119, 233), YK8_8_r136(137, 133, 247), YK8_9_r137(145, 141, 255),
    YK8_10_r138(156, 152, 255), YK8_11_r139(167, 164, 255), YK8_12_r140(178, 175, 255), YK8_13_r141(187, 184, 255),
    YK8_14_r142(195, 193, 255), YK8_15_r143(211, 209, 255), YK9_0_r144(29, 41, 90), YK9_1_r145(29, 56, 118),
    YK9_2_r146(29, 72, 146), YK9_3_r147(29, 92, 172), YK9_4_r148(29, 113, 198), YK9_5_r149(50, 134, 207),
    YK9_6_r150(72, 155, 217), YK9_7_r151(78, 168, 236), YK9_8_r152(85, 182, 255), YK9_9_r153(105, 202, 255),
    YK9_10_r154(116, 203, 255), YK9_11_r155(130, 211, 255), YK9_12_r156(141, 218, 255), YK9_13_r157(159, 212, 255),
    YK9_14_r158(180, 226, 255), YK9_15_r159(192, 235, 255), YK10_0_r160(0, 75, 89), YK10_1_r161(0, 93, 110),
    YK10_2_r162(0, 111, 132), YK10_3_r163(0, 132, 156), YK10_4_r164(0, 153, 191), YK10_5_r165(0, 171, 202),
    YK10_6_r166(0, 188, 222), YK10_7_r167(0, 208, 245), YK10_8_r168(16, 220, 255), YK10_9_r169(62, 225, 255),
    YK10_10_r170(100, 231, 255), YK10_11_r171(118, 234, 255), YK10_12_r172(139, 237, 255), YK10_13_r173(154, 239, 255),
    YK10_14_r174(177, 243, 255), YK10_15_r175(199, 246, 255), YK11_0_r176(0, 72, 0), YK11_1_r177(0, 84, 0),
    YK11_2_r178(3, 107, 3), YK11_3_r179(14, 118, 14), YK11_4_r180(24, 128, 24), YK11_5_r181(39, 146, 39),
    YK11_6_r182(54, 164, 54), YK11_7_r183(78, 185, 78), YK11_8_r184(81, 205, 81), YK11_9_r185(114, 218, 114),
    YK11_10_r186(124, 228, 124), YK11_11_r187(133, 237, 133), YK11_12_r188(153, 242, 153), YK11_13_r189(179, 247, 179),
    YK11_14_r190(195, 249, 195), YK11_15_r191(205, 252, 205), YK12_0_r192(22, 64, 0), YK12_1_r193(28, 83, 0),
    YK12_2_r194(35, 102, 0), YK12_3_r195(40, 120, 0), YK12_4_r196(46, 140, 0), YK12_5_r197(58, 152, 12),
    YK12_6_r198(71, 165, 25), YK12_7_r199(81, 175, 35), YK12_8_r200(92, 186, 46), YK12_9_r201(113, 207, 67),
    YK12_10_r202(133, 227, 87), YK12_11_r203(141, 235, 95), YK12_12_r204(151, 245, 105), YK12_13_r205(160, 254, 114),
    YK12_14_r206(177, 255, 138), YK12_15_r207(188, 255, 154), YK13_0_r208(44, 53, 0), YK13_1_r209(56, 68, 0),
    YK13_2_r210(68, 82, 0), YK13_3_r211(73, 86, 0), YK13_4_r212(96, 113, 0), YK13_5_r213(108, 127, 0),
    YK13_6_r214(121, 141, 10), YK13_7_r215(139, 159, 28), YK13_8_r216(158, 178, 47), YK13_9_r217(171, 191, 60),
    YK13_10_r218(184, 204, 73), YK13_11_r219(194, 214, 83), YK13_12_r220(205, 225, 83), YK13_13_r221(219, 239, 108),
    YK13_14_r222(232, 252, 121), YK13_15_r223(242, 255, 171), YK14_0_r224(70, 58, 9), YK14_1_r225(77, 63, 9),
    YK14_2_r226(84, 69, 9), YK14_3_r227(108, 88, 9), YK14_4_r228(144, 118, 9), YK14_5_r229(171, 139, 10),
    YK14_6_r230(193, 161, 32), YK14_7_r231(208, 176, 47), YK14_8_r232(222, 190, 61), YK14_9_r233(230, 198, 69),
    YK14_10_r234(237, 205, 76), YK14_11_r235(245, 216, 98), YK14_12_r236(251, 226, 118), YK14_13_r237(252, 238, 152),
    YK14_14_r238(253, 243, 169), YK14_15_r239(253, 243, 190), YK15_0_r240(64, 26, 2), YK15_1_r241(88, 31, 5),
    YK15_2_r242(112, 36, 8), YK15_3_r243(141, 58, 19), YK15_4_r244(171, 81, 31), YK15_5_r245(181, 100, 39),
    YK15_6_r246(191, 119, 48), YK15_7_r247(208, 133, 58), YK15_8_r248(225, 147, 68), YK15_9_r249(237, 160, 78),
    YK15_10_r250(249, 173, 88), YK15_11_r251(252, 183, 92), YK15_12_r252(255, 193, 96), YK15_13_r253(255, 202, 105),
    YK15_14_r254(255, 207, 126), YK15_15_r255(255, 218, 150);

    private Position position;

    private final int r;
    private final int g;
    private final int b;

    Youkai(int r, int g, int b) {
        this.r = r;
        this.g = g;
        this.b = b;
    }

    public static Youkai getYoukaiByRank(int rank) {
        for (Youkai youkai : Youkai.values()) {
            if (youkai.rank() == rank) {
                return youkai;
            }
        }
        System.out.println("no youkai is founded. Should'nt be that.");
        return null;
    }

    public int rank() {
        return this.ordinal() + 1;
    }

    public void swapPosition(Youkai another) {
        Position p = another.position;
        this.position.setLinable(another);
        p.setLinable(this);
    }

    @Override
    public String toString() {
        return "\033[48;2;" + this.r + ";" + this.g + ";" + this.b + ";38;2;0;0;0m   "
                + String.format("%03d", this.rank()) + "   \033[0m";
    }

    @Override
    public void setPosition(Position position) {
        this.position = position;
    }

    @Override
    public Position getPosition() {
        return this.position;
    }

    @Override
    public int getValue() {
        return this.rank();
    }
}
