package com.zeitspace.kotlinworkshop.model;

import java.util.List;

public final class AppUserJv {

    private String firstName;
    private String lastName;
    private String email;
    private int passwordHash;

    public AppUserJv(String firstName, String lastName, String email, int passwordHash) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.passwordHash = passwordHash;
    }

    public AppUserJv(String lastName, String email, int passwordHash) {
        this("", lastName, email, passwordHash);
    }

    public AppUserJv(String email, int passwordHash) {
        this("", "", email, passwordHash);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(int passwordHash) {
        this.passwordHash = passwordHash;
    }

    @Override
    public int hashCode() {
        return this.firstName.hashCode() * this.lastName.hashCode() * this.email.hashCode() * passwordHash;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (firstName.length() > 0) {
            sb.append("firstName: ");
            sb.append(firstName);
            sb.append(',');
        }
        if (lastName.length() > 0) {
            sb.append("lastName: ");
            sb.append(lastName);
            sb.append(',');
        }
        sb.append("email: ");
        sb.append(email);
        sb.append(',');

        sb.append("passwordHash: ");

        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof  AppUserJv)) {
            return false;
        } else {
            AppUserJv user = (AppUserJv) obj;
            return user.email.equals(email) && user.firstName.equals(firstName) && user.lastName.equals(lastName) &&
                    user.passwordHash == passwordHash;
        }
    }

    public static int hash(String password) {
        int hash = 0;
        int characterHash;
        for (Character c : password.toCharArray()) {
            hash /= 3;
            if ((characterHash = c.hashCode()) != 0) {
                hash *= characterHash;
            }
        }

        return hash;
    }

    public static AppUserJv newUser(String firstName, String lastName, String email, String password) {
        if (email == null || password == null) {
            return null;
        }

        int passwordHash = hash(password);

        if (lastName == null) {
            return new AppUserJv(email, passwordHash);
        } else if (firstName == null) {
            return new AppUserJv(lastName, email, passwordHash);
        } else {
            return new AppUserJv(firstName, lastName, email, passwordHash);
        }
    }

    public static AppUserJv login(List<AppUserJv> users, String email, String password) {
        return login(users.toArray(new AppUserJv[0]), email, password);
    }

    public static AppUserJv login(AppUserJv[] users, String email, String password) {
        int hash = hash(password);
        for (AppUserJv user : users) {
            if (user.email.equals(email) && user.passwordHash == hash) {
                return user;
            }
        }
        return null;
    }
}
