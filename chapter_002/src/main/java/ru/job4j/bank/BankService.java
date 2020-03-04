package ru.job4j.bank;

import java.util.*;

/**
 * Class models service that bank provides
 *
 * @author Alex Dotsyak
 * @version 1
 * @since 0.1
 */
public class BankService {

    /**
     * Map of unique users, who can have many accounts
     */
    private Map<User, List<Account>> users = new HashMap<>();

    /**
     * Add user to map
     *
     * @param user - user
     */
    public void addUser(User user) {
        this.users.put(user, new ArrayList<>());
    }

    /**
     * Add account to user, by his passport
     *
     * @param passport - passport
     * @param account  - new account
     */
    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
            this.users.get(user).add(account);
        }
    }

    /**
     * Find user by passport
     *
     * @param passport - passport
     * @return - user
     */
    public User findByPassport(String passport) {
        Set<User> users = this.users.keySet();
        for (User user : users) {
            if (user.getPassport().equals(passport)) {
                return user;
            }
        }
        return null;
    }

    /**
     * Finds account of user by his passport and requisite of account
     *
     * @param passport  - passport
     * @param requisite - requisite
     * @return account
     */
    public Account findByRequisite(String passport, String requisite) {
        Account account = null;
        User user = findByPassport(passport);

        if (user != null) {
            for (Account ac : this.users.get(user)) {
                if (ac.getRequisite().equals(requisite)) {
                    account = ac;
                    break;
                }
            }
        }

        return account;
    }

    /**
     * Transfers money from source account of source user to destination account of destination user
     *
     * @param srcPassport   - source users passport
     * @param srcRequisite  - source users account requisite
     * @param destPassport  - destination users passport
     * @param destRequisite - destination users account requisite
     * @param amount        - amount of transfer
     * @return true - if transfer succeeded, false - if didn't
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;

        User srcUser = findByPassport(srcPassport);
        User destUser = findByPassport(destPassport);

        Account srcAc = findByRequisite(srcPassport, srcRequisite);
        Account destAc = findByRequisite(destPassport, destRequisite);

        int srcIndex = this.users.get(srcUser).indexOf(srcAc);
        int destIndex = this.users.get(destUser).indexOf(destAc);

        if (this.users.get(srcUser).contains(srcAc) && this.users.get(destUser).contains(destAc)) {

            this.users.get(srcUser).get(srcIndex).setBalance(srcAc.getBalance() - amount);
            this.users.get(destUser).get(destIndex).setBalance(destAc.getBalance() + amount);

            rsl = true;
        }

        return rsl;
    }
}
