package com.unity3d.services.core.device.reader.pii;

import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import com.unity3d.services.core.misc.IJsonStorageReader;

/* loaded from: classes3.dex */
public class PiiTrackingStatusReader {
    private final IJsonStorageReader _jsonStorageReader;

    public PiiTrackingStatusReader(IJsonStorageReader iJsonStorageReader) {
        this._jsonStorageReader = iJsonStorageReader;
    }

    private PiiPrivacyMode getSpmPrivacyMode() {
        return getPrivacyMode(JsonStorageKeyNames.PRIVACY_SPM_KEY);
    }

    private PiiPrivacyMode getUserPrivacyMode() {
        return getPrivacyMode(JsonStorageKeyNames.PRIVACY_MODE_KEY);
    }

    public PiiPrivacyMode getPrivacyMode() {
        PiiPrivacyMode userPrivacyMode = getUserPrivacyMode();
        PiiPrivacyMode piiPrivacyMode = PiiPrivacyMode.NULL;
        if (userPrivacyMode == piiPrivacyMode && getSpmPrivacyMode() == piiPrivacyMode) {
            return piiPrivacyMode;
        }
        PiiPrivacyMode userPrivacyMode2 = getUserPrivacyMode();
        PiiPrivacyMode piiPrivacyMode2 = PiiPrivacyMode.APP;
        if (userPrivacyMode2 != piiPrivacyMode2 && getSpmPrivacyMode() != piiPrivacyMode2) {
            PiiPrivacyMode userPrivacyMode3 = getUserPrivacyMode();
            piiPrivacyMode2 = PiiPrivacyMode.MIXED;
            if (userPrivacyMode3 != piiPrivacyMode2 && getSpmPrivacyMode() != piiPrivacyMode2) {
                PiiPrivacyMode userPrivacyMode4 = getUserPrivacyMode();
                piiPrivacyMode2 = PiiPrivacyMode.NONE;
                if (userPrivacyMode4 != piiPrivacyMode2 && getSpmPrivacyMode() != piiPrivacyMode2) {
                    return PiiPrivacyMode.UNDEFINED;
                }
            }
        }
        return piiPrivacyMode2;
    }

    public boolean getUserNonBehavioralFlag() {
        IJsonStorageReader iJsonStorageReader = this._jsonStorageReader;
        if (iJsonStorageReader != null) {
            Object obj = iJsonStorageReader.get(JsonStorageKeyNames.USER_NON_BEHAVIORAL_VALUE_KEY);
            if (obj == null) {
                obj = this._jsonStorageReader.get(JsonStorageKeyNames.USER_NON_BEHAVIORAL_VALUE_ALT_KEY);
            }
            if (obj instanceof String) {
                return Boolean.parseBoolean((String) obj);
            }
            if (obj instanceof Boolean) {
                return ((Boolean) obj).booleanValue();
            }
        }
        return false;
    }

    private PiiPrivacyMode getPrivacyMode(String str) {
        String str2;
        IJsonStorageReader iJsonStorageReader = this._jsonStorageReader;
        if (iJsonStorageReader != null) {
            Object obj = iJsonStorageReader.get(str);
            if (obj instanceof String) {
                str2 = (String) obj;
                return PiiPrivacyMode.getPiiPrivacyMode(str2);
            }
        }
        str2 = null;
        return PiiPrivacyMode.getPiiPrivacyMode(str2);
    }
}
