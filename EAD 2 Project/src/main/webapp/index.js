let seats = document.querySelector(".all-seats");
let tickets = seats.querySelectorAll("input");
tickets.forEach((ticket) => {
    ticket.addEventListener("change", () => {
        let amount = document.querySelector(".amount").innerHTML;
        let count = document.querySelector(".count").innerHTML;
        amount = Number(amount);
        count = Number(count);

        if(ticket.checked){
            amount += 800;
            count += 1;
        }
        else{
            amount -= 800;
            count -= 1;
        }

        document.querySelector(".amount").innerHTML = amount;
        document.querySelector(".count").innerHTML = count;
    });
});

function bookSeats() {
    // Collect selected seats
    const selectedSeats = [];
    document.querySelectorAll('input[name="tickets"]:checked').forEach((seat) => {
      selectedSeats.push(seat.id);
    });

    // Collect selected date and time
    const selectedDate = document.querySelector('input[name="date"]:checked + label .date').textContent;
    const selectedTime = document.querySelector('input[name="time"]:checked + label').textContent;

    // Collect total price (assuming you update the price dynamically)
    const price = document.querySelector('.amount').textContent;

    // Prepare the data
    const bookingData = {
      seats: selectedSeats,
      date: selectedDate,
      time: selectedTime,
      price: price
    };

    // Send the data to the server via an AJAX POST request
    fetch('/api/bookings', {
      method: 'POST',
      headers: {
        'Content-Type': 'application/json'
      },
      body: JSON.stringify(bookingData)
    })
    .then(response => response.text())
    .then(data => {
      alert(data);  // Display response from server
    })
    .catch(error => {
      console.error('Error:', error);
    });
  }

  function redirectToView() {
      window.location.href = "view.jsp";
  }