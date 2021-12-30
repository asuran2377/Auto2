@regression
Feature: Kiem tra chua nang Dang Nhap va Nap tien
        User co the dang nhap vi va thuc hien nap tien vao vi
    Scenario: Mo trinh duyet va nap tien
        Given Mo trinh duyet de nap tien
        When Dang nhap so dien thoai vao web
        And Thuc hien nap tien vao vi
        Then Giao dich nap tien thanh cong
        
    Scenario: Mo trinh duyet va rut tien
        Given Chon dich vu rut tien khoi vi
        When Nhap thong tin rut tien
        Then Giao dich rut tien thanh cong
     
    Scenario: Mo trinh duyet va chuyen tien
        Given Chon dich vu chuyen tien khoi vi
        When Nhap thong tin chuyen tien
        Then Giao dich chuyen tien thanh cong                 