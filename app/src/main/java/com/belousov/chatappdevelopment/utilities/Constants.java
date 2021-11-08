package com.belousov.chatappdevelopment.utilities;

import java.util.HashMap;

public class Constants {
    public static final String KEY_COLLECTION_USERS = "users",
                               KEY_NAME = "name",
                               KEY_EMAIL = "email",
                               KEY_PASSWORD = "password",
                               KEY_PREFERENCE_NAME = "chatAppPreference",
                               KEY_IS_SIGNED_IN = "isSignedIn",
                               KEY_USER_ID = "userId",
                               KEY_IMAGE = "image",
                               KEY_FCM_TOKEN = "fcmToken",
                               KEY_USER = "user",
                               KEY_COLLECTION_CHAT = "chat",
                               KEY_SENDER_ID = "senderId",
                               KEY_RECEIVER_ID = "receiverId",
                               KEY_MESSAGE = "message",
                               KEY_TIMESTAMP = "timestamp",
                               KEY_COLLECTION_CONVERSATIONS = "conversations",
                               KEY_SENDER_NAME = "senderName",
                               KEY_RECEIVER_NAME = "receiverName",
                               KEY_SENDER_IMAGE = "senderImage",
                               KEY_RECEIVER_IMAGE = "receiverImage",
                               KEY_LAST_MESSAGE = "lastMessage",
                               KEY_AVAILABILITY = "availability",
                               REMOTE_MSG_AUTHORIZATION = "Authorization",
                               REMOTE_MSG_CONTENT_TYPE = "Content-Type",
                               REMOTE_MSG_DATA = "data",
                               REMOTE_MSG_REGISTRATION_IDS = "registration_ids";

    public static HashMap<String, String> remoteMsgHeaders = null;

    public static HashMap<String, String> getRemoteMsgHeaders() {
        if (remoteMsgHeaders == null) {
            remoteMsgHeaders = new HashMap<>();
            remoteMsgHeaders.put(
                    REMOTE_MSG_AUTHORIZATION,
                    "key=AAAAr814yVs:APA91bFyNyiKHD8Yd2zx_k0AhsAvXRAshpksrARFN2wmyb084kOcMFDz5Ovdc1kprELItVxamctaPEy411VWtthJqrsiKsTT-gogP1pgDV0swZO1M0VSyw9PUnxeuF8Q4UbYvmEpJKj9"
            );
            remoteMsgHeaders.put(
                    REMOTE_MSG_CONTENT_TYPE,
                    "application/json"
            );
        }
        return remoteMsgHeaders;
    }
}
