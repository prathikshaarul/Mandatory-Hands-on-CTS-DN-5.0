DECLARE
    CURSOR customer_cursor IS
        SELECT customer_id, age
        FROM customers;
BEGIN
    FOR customer_rec IN customer_cursor LOOP
        
        IF customer_rec.age > 60 THEN
            UPDATE loans
            SET interest_rate = interest_rate - 1
            WHERE customer_id = customer_rec.customer_id;
            
            DBMS_OUTPUT.PUT_LINE(
                '1% interest discount applied for Customer ID: ' 
                || customer_rec.customer_id
            );
        END IF;
        
    END LOOP;

    COMMIT;
END;
/