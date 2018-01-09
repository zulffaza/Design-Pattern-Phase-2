package creational.builder.model;

/**
 * Merupakan class yang mengimplementasikan builder pattern
 *
 * @author Faza Zulfika P P
 * @since 9 January 2017
 * @version 1.0.0
 */
public class User {

    /**
     * Field nrp user, bertipe Integer
     */
    private Integer nrp;

    /**
     * Field name user, bertipe String
     */
    private String name;

    /**
     * Field email user, bertipe String
     */
    private String email;

    /**
     * field phone user, bertipe String
     */
    private String phone;

    /**
     * Field address user, bertipe String
     */
    private String address;

    /**
     * Merupakan default constructor dari SingletonUser
     */
    public User() {
        // Default constructor
    }

    /**
     * Merupakan constructor yang menerima dua parameter, nrp dan name
     *
     * @param nrp merupakan nrp user
     * @param name merupakan name user
     */
    public User(Integer nrp, String name) {
        this.nrp = nrp;
        this.name = name;
    }

    /**
     * Merupakan constructor yang menerima parameter builder
     *
     * @param builder merupakan builder class User
     */
    public User(Builder builder) {
        this.nrp = builder.nrp;
        this.name = builder.name;
        this.email = builder.email;
        this.phone = builder.phone;
        this.address = builder.address;
    }

    /**
     * Getter dari field nrp
     *
     * @return nrp dari user
     */
    public Integer getNrp() {
        return nrp;
    }

    /**
     * Setter dari field nrp
     *
     * @param nrp merupakan nrp dari user
     */
    public void setNrp(Integer nrp) {
        this.nrp = nrp;
    }

    /**
     * Getter dari field name
     *
     * @return name dari user
     */
    public String getName() {
        return name;
    }

    /**
     * Setter dari field name
     *
     * @param name merupakan name dari user
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter dari field email
     *
     * @return email dari user
     */
    public String getEmail() {
        return email;
    }

    /**
     * Setter dari field email
     *
     * @param email merupakan email dari user
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Getter dari field phone
     *
     * @return phone dari user
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Setter dari field phone
     *
     * @param phone merupakan phone dari user
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * Getter dari field address
     *
     * @return address dari user
     */
    public String getAddress() {
        return address;
    }

    /**
     * Setter dari field address
     *
     * @param address merupakan address dari user
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Merupakan class builder untuk membuat instance / object dari class User
     *
     * @author Faza Zulfika P P
     * @since 9 January 2018
     * @version 1.0.0
     */
    public static class Builder {

        /**
         * Field nrp user, bertipe Integer
         */
        private Integer nrp; // Required

        /**
         * Field name user, bertipe String
         */
        private String name; // Required

        /**
         * Field email user, bertipe String
         */
        private String email; // Optional

        /**
         * field phone user, bertipe String
         */
        private String phone; // Optional

        /**
         * Field address user, bertipe String
         */
        private String address; // Optional

        /**
         * Merupakan default constructor dari Builder
         */
        public Builder() {
            // Default constructor
        }

        /**
         * Merupakan constructor yang menerima dua parameter, nrp dan name
         *
         * @param nrp merupakan nrp dari user
         * @param name merupakan nama dari user
         */
        public Builder(Integer nrp, String name) {
            this.nrp = nrp;
            this.name = name;
        }

        /**
         * Setter dari field nrp
         *
         * @param nrp merupakan nrp user
         * @return merupakan instance / object Builder
         */
        public Builder setNrp(Integer nrp) {
            this.nrp = nrp;
            return this;
        }

        /**
         * Setter dari field name
         *
         * @param name merupakan name user
         * @return merupakan instance / object Builder
         */
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        /**
         * Setter dari field email
         *
         * @param email merupakan email user
         * @return merupakan instance / object Builder
         */
        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        /**
         * Setter dari field phone
         *
         * @param phone merupakan phon user
         * @return merupakan instance / object Builder
         */
        public Builder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        /**
         * Setter dari field address
         *
         * @param address merupakan address user
         * @return merupakan instance / object Builder
         */
        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        /**
         * Merupakan method untuk membuat instance / object dari class User
         * Instance / object dari class user memiliki field yang sudah diatur oleh Builder
         *
         * @return merupakan instance / object dari class User
         */
        public User build() {
            return new User(this);
        }
    }
}
