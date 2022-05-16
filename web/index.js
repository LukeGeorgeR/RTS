const popups = document.querySelectorAll('.popup');

const disablePopups = () => {
  popups.forEach((popup) => {
    popup.classList.remove('is-shown');
  });
}

const handleClick = (e) => {
  const targetEL = e.target;

  if (targetEL.classList.contains('btn')) {
    disablePopups();

    const popup = document.getElementById(targetEL.dataset.popup);
    popup.classList.add('is-shown');

    setTimeout(() => { popup.classList.remove('is-shown') }, 8000);
    return;
  }

  if (targetEL.classList.contains('popup')) {
    return;
  }

  disablePopups();
}


document.addEventListener('click', handleClick);

document.addEventListener('touchend', handleClick);
