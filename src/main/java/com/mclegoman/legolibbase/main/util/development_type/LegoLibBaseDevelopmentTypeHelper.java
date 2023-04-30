package com.mclegoman.legolibbase.main.util.development_type;

import com.mclegoman.legolibbase.main.util.code_type.LegoLibBaseCodeType;
import net.minecraft.text.Text;

public class LegoLibBaseDevelopmentTypeHelper {
    public static String getDevelopmentTypeString(LegoLibBaseDevelopmentType developmentType, LegoLibBaseCodeType codeType) {
        if (codeType == LegoLibBaseCodeType.SHORT_CODE) {
            if (developmentType == LegoLibBaseDevelopmentType.ALPHA) return "alpha";
            if (developmentType == LegoLibBaseDevelopmentType.BETA) return "beta";
            if (developmentType == LegoLibBaseDevelopmentType.RELEASE_CANDIDATE) return "rc";
            if (developmentType == LegoLibBaseDevelopmentType.RELEASE) return "release";
        }
        if (codeType == LegoLibBaseCodeType.LONG_CODE) {
            if (developmentType == LegoLibBaseDevelopmentType.ALPHA) return "Alpha";
            if (developmentType == LegoLibBaseDevelopmentType.BETA) return "Beta";
            if (developmentType == LegoLibBaseDevelopmentType.RELEASE_CANDIDATE) return "Release Candidate";
            if (developmentType == LegoLibBaseDevelopmentType.RELEASE) return "Release";
        }
        if (codeType == LegoLibBaseCodeType.SENTENCED_LONG_CODE) {
            if (developmentType == LegoLibBaseDevelopmentType.ALPHA) return "an Alpha";
            if (developmentType == LegoLibBaseDevelopmentType.BETA) return "a Beta";
            if (developmentType == LegoLibBaseDevelopmentType.RELEASE_CANDIDATE) return "a Release Candidate";
            if (developmentType == LegoLibBaseDevelopmentType.RELEASE) return "a Release";
        }
        return "UNKNOWN";
    }
    public static Text getDevelopmentTypeText(LegoLibBaseDevelopmentType developmentType, LegoLibBaseCodeType codeType) {
        if (codeType == LegoLibBaseCodeType.SHORT_CODE) {
            if (developmentType == LegoLibBaseDevelopmentType.ALPHA) return Text.translatable("legolib.base.development_type.alpha.short_code");
            if (developmentType == LegoLibBaseDevelopmentType.BETA) return Text.translatable("legolib.base.development_type.alpha.short_code");
            if (developmentType == LegoLibBaseDevelopmentType.RELEASE_CANDIDATE) return Text.translatable("legolib.base.development_type.alpha.short_code");
            if (developmentType == LegoLibBaseDevelopmentType.RELEASE) return Text.translatable("legolib.base.development_type.alpha.short_code");
        }
        if (codeType == LegoLibBaseCodeType.LONG_CODE) {
            if (developmentType == LegoLibBaseDevelopmentType.ALPHA) return Text.translatable("legolib.base.development_type.alpha.long_code");
            if (developmentType == LegoLibBaseDevelopmentType.BETA) return Text.translatable("legolib.base.development_type.alpha.long_code");
            if (developmentType == LegoLibBaseDevelopmentType.RELEASE_CANDIDATE) return Text.translatable("legolib.base.development_type.alpha.long_code");
            if (developmentType == LegoLibBaseDevelopmentType.RELEASE) return Text.translatable("legolib.base.development_type.alpha.long_code");
        }
        if (codeType == LegoLibBaseCodeType.SENTENCED_LONG_CODE) {
            if (developmentType == LegoLibBaseDevelopmentType.ALPHA) return Text.translatable("legolib.base.development_type.alpha.sentenced_long_code");
            if (developmentType == LegoLibBaseDevelopmentType.BETA) return Text.translatable("legolib.base.development_type.alpha.sentenced_long_code");
            if (developmentType == LegoLibBaseDevelopmentType.RELEASE_CANDIDATE) return Text.translatable("legolib.base.development_type.alpha.sentenced_long_code");
            if (developmentType == LegoLibBaseDevelopmentType.RELEASE) return Text.translatable("legolib.base.development_type.alpha.sentenced_long_code");
        }
        return Text.translatable("legolib.base.development_type.unknown");
    }
}
