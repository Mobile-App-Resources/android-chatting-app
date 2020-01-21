package com.ceocho.kakaotalk.Notifications;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.messaging.FirebaseMessagingService;

public class MyFirebaseIdService extends FirebaseMessagingService {

    @Override
    public void onNewToken(String token) {
        super.onNewToken(token);
        FirebaseUser firebaseUser = FirebaseAuth.getInstance().getCurrentUser();

        String newToken = FirebaseInstanceId.getInstance().getToken();
        if (firebaseUser != null){
            updateToken(newToken);
        }
    }

    private void updateToken(String newToken) {
        FirebaseUser firebaseUser = FirebaseAuth.getInstance().getCurrentUser();

        DatabaseReference reference = FirebaseDatabase.getInstance().getReference("Token");
        Token token = new Token(newToken);
        reference.child(firebaseUser.getUid()).setValue(token);
    }
}
