package com.unity3d.services.core.device.reader.pii;

import com.unity3d.services.core.configuration.Experiments;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import com.unity3d.services.core.misc.IJsonStorageReader;
import com.unity3d.services.core.misc.Utilities;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class PiiDataSelector {
    private final Experiments _experiments;
    private final IJsonStorageReader _jsonStorageReader;
    private final PiiTrackingStatusReader _piiTrackingStatusReader;

    /* renamed from: com.unity3d.services.core.device.reader.pii.PiiDataSelector$2  reason: invalid class name */
    /* loaded from: classes3.dex */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$unity3d$services$core$device$reader$pii$PiiPrivacyMode;

        static {
            int[] iArr = new int[PiiPrivacyMode.values().length];
            $SwitchMap$com$unity3d$services$core$device$reader$pii$PiiPrivacyMode = iArr;
            try {
                iArr[PiiPrivacyMode.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$unity3d$services$core$device$reader$pii$PiiPrivacyMode[PiiPrivacyMode.NULL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$unity3d$services$core$device$reader$pii$PiiPrivacyMode[PiiPrivacyMode.MIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public PiiDataSelector(PiiTrackingStatusReader piiTrackingStatusReader, IJsonStorageReader iJsonStorageReader, Experiments experiments) {
        this._piiTrackingStatusReader = piiTrackingStatusReader;
        this._jsonStorageReader = iJsonStorageReader;
        this._experiments = experiments;
    }

    private PiiDecisionData allowTrackingDecision() {
        return new PiiDecisionData(this._experiments.isUpdatePiiFields() ? DataSelectorResult.UPDATE : DataSelectorResult.INCLUDE, getPiiContentFromStorage());
    }

    private Map<String, Object> getPiiContentFromStorage() {
        Object obj = this._jsonStorageReader.get(JsonStorageKeyNames.UNIFIED_CONFIG_PII_KEY);
        HashMap hashMap = new HashMap();
        return obj instanceof JSONObject ? Utilities.combineJsonIntoMap(hashMap, (JSONObject) obj, "unifiedconfig.pii.") : hashMap;
    }

    private HashMap<String, Object> getUserBehavioralAttribute() {
        return new HashMap<String, Object>() { // from class: com.unity3d.services.core.device.reader.pii.PiiDataSelector.1
            {
                put(JsonStorageKeyNames.USER_NON_BEHAVIORAL_KEY, Boolean.valueOf(PiiDataSelector.this._piiTrackingStatusReader.getUserNonBehavioralFlag()));
            }
        };
    }

    private PiiDecisionData mixedModeDecision() {
        if (this._piiTrackingStatusReader.getUserNonBehavioralFlag()) {
            return new PiiDecisionData(DataSelectorResult.INCLUDE, getUserBehavioralAttribute());
        }
        PiiDecisionData allowTrackingDecision = allowTrackingDecision();
        allowTrackingDecision.appendData(getUserBehavioralAttribute());
        return allowTrackingDecision;
    }

    private PiiDecisionData notAllowedDecision() {
        return new PiiDecisionData(DataSelectorResult.EXCLUDE);
    }

    public PiiDecisionData whatToDoWithPII() {
        int i10 = AnonymousClass2.$SwitchMap$com$unity3d$services$core$device$reader$pii$PiiPrivacyMode[this._piiTrackingStatusReader.getPrivacyMode().ordinal()];
        if (i10 == 1 || i10 == 2) {
            return allowTrackingDecision();
        }
        if (i10 != 3) {
            return notAllowedDecision();
        }
        return mixedModeDecision();
    }
}
