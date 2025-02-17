stateDiagram-v2
    [*] --> Created: Customer submits request
    Created --> UnderReview: Reservation staff reviews
    UnderReview --> QuoteSent: Manager approves quote
    QuoteSent --> Reserved: Customer pays through CHIPay
    Reserved --> InProgress: Trip starts
    InProgress --> OrderPlaced: Customer deposits 30%
    OrderPlaced --> Delivered: Delivery staff confirms
    OrderPlaced --> Cancelled: Customer cancels delivery
    Reserved --> Cancelled: Customer cancels <48h before trip
    Delivered --> [*]
    Cancelled --> [*]
    
    note right of Created
        Includes: breeds, farm,
        departure date, budget
    end note
    
    note right of Reserved
        Staff can send trip details
        (airfare, hotel, etc.)
    end note
    
    note right of OrderPlaced
        Consulting staff updates
        purchase details with farm
    end note
    
    note left of Cancelled
        If cancelled before delivery:
        deposit lost
        If poor quality/fault:
        deposit refunded
    end note
